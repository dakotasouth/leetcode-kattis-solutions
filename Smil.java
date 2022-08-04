package kattis;

import java.util.*;
import java.io.*;

public class Smil {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split("");
        
        for (int i = 0; i < line.length - 1; i++) {
            if(line[i].compareTo(":") == 0 || line[i].compareTo(";") == 0){
                if(line[i+1].compareTo(")") == 0) System.out.println(i);
                else if(line[i+1].compareTo("-") == 0 && i+2 < line.length) {
                    if (line[i+2].compareTo(")") == 0) System.out.println(i);
                }
            }
        }
    }
}
