package kattis;

import java.util.*;
import java.io.*;

public class BracketPairing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lineArr = line.split("");
        String[] brkts = {")","]",">","}","(","{","[","<"};
        TreeSet<String> bSeq = new TreeSet<>();
        for (int i = 0; i < lineArr.length; i++) {
            System.out.println(i);
            if(lineArr[i].equals("?")){
                //adds first subseq, can first be "?"
                if(bSeq.isEmpty()) {
                    bSeq.add(brkts[4]);
                    bSeq.add(brkts[5]);
                    bSeq.add(brkts[6]);
                    bSeq.add(brkts[7]);
                }
                //System.out.println(line.substring(0,i));
                //Fixes Concurrent Modification Error
                ArrayList<String> toAdd = new ArrayList<>();
                //add all brackets to each subSeq and check if valid then replace
                for(String subSeq: bSeq){
                    System.out.println(subSeq);
                    for(String s: brkts){
                        if(validSeq(subSeq+s)) {                                                        
                            toAdd.add(subSeq+s);
                        }
                    }
                    if(i < lineArr.length-2){
                        //sequence can end with open bracket
                        for (int j = 0; j < brkts.length; j++) {
                            if(validSeq(subSeq.substring(subSeq.length()-1)+brkts[j])){
                                toAdd.add(subSeq + brkts[j]);
                            }
                            if(j>=4) toAdd.add(subSeq+brkts[j]);
                        }
                    }
                }
                //System.out.println(toAdd.size() + " " + bSeq.size());
                if(i == 5)break;
                //clear and add all updated subSeq
                bSeq.clear();
                bSeq.addAll(toAdd);
            }
            else{
                ArrayList<String> toAdd = new ArrayList<>();
                
                for(String s: bSeq){
                    toAdd.add(s+lineArr[i]);
                }
                bSeq.clear();
                bSeq.addAll(toAdd);
            }
        }
        int count = 0;
        //System.out.println("Final Count");
        for(String s: bSeq){
            //System.out.println(bSeq);
            if (validSeq(s)){
                //System.out.println(s);
                count++;
            }
        }
        System.out.println(count);
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
                    else if(top.equals("[") && !seq[i].equals("]")) return false;
                    else if(top.equals("{") && !seq[i].equals("}")) return false;
                    else if(top.equals("<") && !seq[i].equals(">")) return false;
                }
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
