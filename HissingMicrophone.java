package kattis;

import java.util.*;
import java.io.*;

public class HissingMicrophone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] line = sc.next().split("");
        boolean q = false;
        for (int i = 0; i < line.length-1; i++) {
            if (line[i].compareTo("s") == 0 && line[i+1].compareTo("s") == 0){
                q = true;
            }
        }
        if(q) System.out.println("hiss");
        else System.out.println("no hiss");
    }
}
