package kattis;

import java.util.*;
import java.io.*;

public class WordleWithFriends {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); int y = sc.nextInt();
        String[] green = new String[5];
        Map<String, Set<Integer>> yellow = new TreeMap<>();
        for (int i = 0; i < x; i++) {
            String[] word = sc.next().split("");
            String[] answer = sc.next().split("");
            sc.nextLine();
            for (int j = 0; j < word.length; j++) {
                if(answer[j].equals("G")){
                    green[j] = word[j];
                }
                if(answer[j].equals("Y")){
                    if(yellow.containsKey(word[j])){
                        Set<Integer> newSet = yellow.get(word[j]);
                        newSet.add(j);
                        yellow.put(word[j], newSet);
                    }
                    else{
                        Set<Integer> newSet = new TreeSet<>();
                        newSet.add(j);
                        yellow.put(word[j], newSet);
                    }
                }
            }
        }
        //shows green and yellow
        //System.out.print("GREEN: "); for(String s: green) System.out.print(s); System.out.println();
        //System.out.print("YELLOW "); for(String s: yellow) System.out.print(s); System.out.println();
        
        for (int i = 0; i < y; i++) {
            String[] wordd = sc.nextLine().split("");
            ArrayList<String> word = new ArrayList<>();
            for(String s: wordd) word.add(s);
            
            boolean valid = true;
            //System.out.println("Green");
            for (int j = 0; j < word.size(); j++) {                
                if(green[j] != null && !green[j].equals(word.get(j))){
                    //System.out.print(green[j] + " " + j);
                    valid = false;
                    
                }
            }
            //System.out.println();
            //System.out.println("Yellow");
            for(String s: yellow.keySet()){
                if (!word.contains(s)){                    
                    valid = false;                    
                }
                //|| green[idx] != null
                else{
                    for(Integer idx: yellow.get(s)){
                        //System.out.print(idx + " ");
                        if (word.get(idx).equals(s)){
                            valid = false;
                            break;
                        }
                    }
                }
                //System.out.println();
            }
            //System.out.println();
            
            if(valid){
                for (int j = 0; j < 5; j++) {
                    System.out.print(wordd[j]);
                }
                System.out.println();
            }
            
        }
    }
}
