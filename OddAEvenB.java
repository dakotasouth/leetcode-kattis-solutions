package kattis1;

import java.util.*;
import java.io.*;

public class OddAEvenB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mod = (int)Math.pow(10,9)+7;
        int [] ans = new int[101];
        int[] a = new int[101]; 
        int[] b = new int[101];
        
        a[1]=1;
        b[2]=1;
        ans[1]=1;
        ans[2]=1;
        for (int i = 3; i < 101; i++) {
            a[i] = (a[i-2]+b[i-1]) % mod;
            System.out.println(a[i]);
            b[i] = (a[i-2]+b[i-1]) % mod;
            System.out.println(b[i]);
            ans[i] = (a[i] + b[i]) % mod;
            System.out.println(ans[i]);
            System.out.println();
        }
        System.out.println(ans[sc.nextInt()]);
    }
}
