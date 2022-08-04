package kattis;

import java.util.*;
import java.io.*;

public class FinalExam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] test = new String[n];
        for (int i = 0; i < n; i++) {
            test[i] = sc.next();
        }
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            if (test[i].compareTo(test[i+1]) == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
