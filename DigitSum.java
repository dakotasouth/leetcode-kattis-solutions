package kattis;

import java.util.*;
import java.io.*;

public class DigitSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            
            HashMap<Long, Long> memo = new HashMap<>();
            long sum = 0;
            for (long j = a; j <= b; j++) {
                long startDig = j / 10;
                long endDig = j % 10;
                if(memo.containsKey(startDig)) sum += memo.get(startDig) + endDig;
                else 
            }
        }
*/
        long a = sc.nextLong();
        long sum = 0;
        for (long i = 0; i < a; i++) {
            String[] num = String.valueOf(i).split("");
            for (int j = 0; j < num.length; j++) {
                sum += Long.valueOf(num[j]);
            }
        }
        System.out.println(sum);
    }
}
