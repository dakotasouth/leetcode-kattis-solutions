package kattis;

import java.util.*;
import java.io.*;

public class LastFactorialDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = {1,2,6,4,0,0,0,0,0,0};
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            System.out.println(digits[x-1]);
        }
    }
}
