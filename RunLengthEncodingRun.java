package kattis;

import java.util.*;
import java.io.*;

public class RunLengthEncodingRun {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String key = sc.next();
        char[] line = sc.next().toCharArray();
        
        if(key.compareTo("E") == 0){
            for(int i=0;i<line.length;i++){
                for (int j = 0; j < line.length; j++) {
                    if(j == line.length-1) System.out.print(line[i] + (j-i));
                    if(line[j] != line[i]){
                        System.out.print(line[i] + (j-i));
                    }
                }
            }
        }
        else{
            for (int i = 0; i < line.length; i++) {
                for (int j = 0; j < Integer.parseInt(String.valueOf(line[i+1])); j++) {
                    System.out.print(line[i]);
                }
                i++;
            }
        }
    }
}
