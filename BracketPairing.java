 
import java.util.*;
import java.io.*;

public class BracketPairing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lineArr = line.split("");
        String[] brkts = {")","]",">","}","(","{","[","<"};
        TreeSet<String> bSeq = new TreeSet<>();
        TreeSet<String> valSeqs = new TreeSet<>();
        long totValids = 0;
        long currValids = 0;
        boolean addOpeners = false;
        for (int i = 0; i < lineArr.length; i++) {
            currValids = 0;
            //System.out.println(bSeq.size() + " " + i);
            if(lineArr[i].equals("?")){
                //Fixes Concurrent Modification Error
                Set<String> toAdd = new TreeSet<>();
                //adds first subseq
                if(bSeq.isEmpty() || addOpeners) {
                    for (int j = 4; j < brkts.length; j++) {
                        toAdd.add(brkts[j]);
                    }
                    addOpeners = false;
                }
                //add brackets to each subSeq and check if valid then replace
                
                for(String subSeq: bSeq){
                    //System.out.println("--  " + subSeq + "  --");
                    if(i%2!=0){
                        for(String s: brkts){
                            if(valSeqs.contains(subSeq+s)){
                                currValids++;
                                addOpeners = true;
                                //System.out.println(subSeq+s+" valid");
                            }
                            else if(validSeq(subSeq+s)) {
                                currValids++;
                                valSeqs.add(subSeq+s);
                                addOpeners = true;
                                //System.out.println(subSeq+s+" valid ");
                            }
                        }
                    }
                    //System.out.println();
                    if(i < lineArr.length-1){                        
                        //sequence can end with open bracket
                        for (int j = 4; j < brkts.length; j++) {
                            toAdd.add(subSeq + brkts[j]);   
                            //System.out.println(subSeq + brkts[j]);
                        }
                        //this allows the case of: ((() or ((())
                        for (int j = 0; j < 4; j++) {
                            // if () is valid but ((() isnt 
                            if(validSeq(subSeq.substring(subSeq.length()-1)+brkts[j]) && !validSeq(subSeq+brkts[j])){
                                toAdd.add(subSeq+brkts[j]);
                                //System.out.println(subSeq+brkts[j] + " case 1");
                            }
                            //if closed brackets is same as last
                            if(subSeq.substring(subSeq.length()-1).equals(brkts[j])){
                                toAdd.add(subSeq.substring(subSeq.length()-1)+brkts[j]);
                                //System.out.println(subSeq.substring(subSeq.length()-1)+brkts[j] + " case 2");
                            }
                        }
                    }
                    
                }
                 
                if(totValids == 0 && currValids > 0) {
                    //System.out.println("added");
                    totValids = currValids;                    
                }
                else if(totValids > 0 && currValids > 0){
                    //System.out.println("added");
                    totValids *= currValids;                    
                }
                //clear and add all updated subSeq
                bSeq.clear();
                bSeq.addAll(toAdd);
                System.out.println("toAdd size: " + toAdd.size() + " totValids: " + totValids + " " + i);
            }
            else {
                Set<String> toAdd = new TreeSet<>();
                if(bSeq.isEmpty() || addOpeners){
                    //System.out.println(lineArr[i]);
                    toAdd.add(lineArr[i]);
                    addOpeners = false;
                }
                else{
                    for(String s: bSeq){
                        //System.out.println("--  " + s + "  --");
                        if(valSeqs.contains(lineArr[i]+s)){
                            currValids++;
                            addOpeners = true;
                            //System.out.println(lineArr[i]+s+" valid");
                        }
                        else if(validSeq(s+lineArr[i])){
                            currValids++;                           
                            addOpeners = true;
                            //System.out.println(s+lineArr[i] + " valid");
                        }
                        else {
                            toAdd.add(s+lineArr[i]);
                            //System.out.println(s+lineArr[i]);
                        }
                    }
                }
                if(totValids == 0 && currValids > 0) {
                    totValids = currValids;
                }
                else if(totValids > 0 && currValids > 0){
                    totValids *= currValids;                    
                }
                System.out.println("toAdd size: " + toAdd.size() + " totValids: " + totValids);
                bSeq.clear();
                bSeq.addAll(toAdd);
            }
        }
        //check if it ended with a validSeq
        if (currValids == 0) totValids = 0;
        
        //System.out.println("Final Count");

        System.out.println(totValids);
    }
    public static boolean validSeq(String seqq){
        //use stack
        String[] seq = seqq.split("");
        Stack<String> stack = new Stack<>();
        ArrayList<String> closers = new ArrayList<>(Arrays.asList(")","]",">","}"));
        //stack.push(seq[0]);
        for (int i = 0; i < seq.length; i++) {
            if(!closers.contains(seq[i])) stack.push(seq[i]);
            else{
                if(stack.size() >= 1){
                    String top = stack.pop();
                    if(top.equals("(") && !seq[i].equals(")")) return false;
                    if(top.equals("[") && !seq[i].equals("]")) return false;
                    if(top.equals("{") && !seq[i].equals("}")) return false;
                    if(top.equals("<") && !seq[i].equals(">")) return false;
                }
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
