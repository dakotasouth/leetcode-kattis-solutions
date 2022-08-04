package kattis;

import java.util.*;
import java.io.*;

public class WordPuzzle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] word = sc.nextLine().split("");
        String[] seq = sc.nextLine().split("");
        
        String[][] allSeqs = new String[seq.length][seq.length];
        allSeqs[0] = seq;
        for (int i = 1; i < seq.length; i++) {
            allSeqs[i][0] = allSeqs[i-1][seq.length-1];
            for (int j = 1; j < seq.length; j++) {
                allSeqs[i][j] = allSeqs[i-1][j-1];
            }
        }
        String[] wordLoop = new String[word.length * 2];
        for (int i = 0; i < word.length*2; i++) {
            if(i < word.length) wordLoop[i] = word[i];
            else wordLoop[i] = word[i - word.length];
            //System.out.print(wordLoop[i] + " ");
        }//System.out.println();
        int count = 0;
        for (int i = 0; i < allSeqs.length; i++) {
            String[] curr = allSeqs[i];
            int idx=0;
            int start=wordLoop.length;
            for (int j = 0; j < wordLoop.length; j++) {
                if(j==start) break;
                if(curr[idx].equals(wordLoop[j])){
                    if(idx==0){
                        start = j+word.length;
                    }
                    if(idx==curr.length-1){
                        count++;
                        break;
                    }
                    idx++;
                }
            }
        }
        System.out.println(count);
    }
}
