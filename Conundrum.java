package kattis;

import java.util.*;
import java.io.*;

public class Conundrum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] cipher = sc.nextLine().split("");
        int count = 0;
        
        for (int i = 0; i < cipher.length; i += 3) {
            if (cipher[i].compareTo("P") != 0) count++;
        }
        for (int i = 1; i < cipher.length; i += 3) {
            if (cipher[i].compareTo("E") != 0) count++;
        }
        for (int i = 2; i < cipher.length; i += 3) {
            if (cipher[i].compareTo("R") != 0) count++;
        }
        System.out.println(count);
    }
}
