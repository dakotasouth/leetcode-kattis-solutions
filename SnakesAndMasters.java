package kattis;

import java.util.*;
import java.io.*;

public class SnakesAndMasters {
    public static long[] memo = new long[10000];
    
    public static long steps(int n){
        
        long curr = 0;
        if(n == 0) return 1;
        else if (n==1) return 1;
        else if (memo[n] != 0) return memo[n];
        else {
            curr = (long)((steps(n-1) + steps(n-2)) % Math.pow(10,6));
            memo[n] = curr;
            //System.out.println(n + " " + curr);
            return curr;
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 2;
        System.out.println(steps(sc.nextInt()));
    }
}
