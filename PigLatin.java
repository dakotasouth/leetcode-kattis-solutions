package kattis;

import java.util.*;
import java.io.*;

public class PigLatin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> vowels = new ArrayList<>();
        vowels.add("a"); vowels.add("e"); vowels.add("i"); vowels.add("o"); vowels.add("u"); vowels.add("y");
        while(sc.hasNext()){
            String[] line = sc.nextLine().split(" ");
            for (int i = 0; i < line.length; i++) {
                if (vowels.contains(line[i].substring(0,1))){
                    line[i] = line[i].concat("yay");
                    System.out.print(line[i] + " ");
                }
                else if(!vowels.contains(line[i].substring(0,1))) {
                    int v = -1;
                    String[] word = line[i].split("");
                    for (int j = 1; j < line[i].length(); j++) {
                        if(vowels.contains(word[j])) {
                            v = j;
                            break;
                        }
                    }
                    line[i] = line[i].substring(v,line[i].length()).concat(line[i].substring(0,v) + "ay");
                    System.out.print(line[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
