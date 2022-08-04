package kattis;

import java.util.*;
import java.io.*;

public class Tarfia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int megab = sc.nextInt();
        int months = sc.nextInt();
        int currM = 0;
        
        for (int i = 0; i < months; i++) {
            currM += megab;
            currM -= sc.nextInt();
        }
        System.out.println(currM += megab);
    }
}
