package kattis1;

import java.util.*;
import java.io.*;

public class Knapsack {
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            int cap = sc.nextInt(); int n = sc.nextInt();
            int[] v = new int[n]; int[] w = new int[n];
            int dp[][] = new int[n+1][cap+1];
            for (int i = 0; i < n+1; i++) {
                for (int j = 0; j < cap+1; j++) {
                    dp[i][j] = Integer.MIN_VALUE;
                }
            }
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt(); w[i] = sc.nextInt();
            }
            for (int i = 0; i < n+1; i++) {
                for (int j = 0; j < cap+1; j++) {
                    if (i==0 || j==0) dp[i][j] = 0;
                    else if (w[i-1]<=j){
                        int a = v[i-1] + dp[i-1][j-w[i-1]];
                        int b = dp[i-1][j];
                        dp[i][j] = Integer.max(a, b);
                    }
                    else dp[i][j] = dp[i-1][j];
                }
            }
            boolean[] items = new boolean[n];
            int itemCt = 0;
            //System.out.println(cap + " " + n);
            int curr = dp[n][cap];
            int capp = cap;
            for (int i = n; i > 0 && curr > 0; i--) {
                if(curr == dp[i-1][capp]) continue;
                else {
                    itemCt++;
                    items[i-1] = true;
                    curr -= v[i-1];
                    capp -= w[i-1];
                }
            }
            System.out.println(itemCt);
            for (int i = 0; i < n; i++) if(items[i]) System.out.print(i+" ");
            System.out.println();
        }
    }
}
