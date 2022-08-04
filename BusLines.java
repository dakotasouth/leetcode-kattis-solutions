package kattis;

import java.util.*;
import java.io.*;

public class BusLines {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        boolean[] used = new boolean[2*n-3];
        for (int i = 0; i < used.length; i++) {
            used[i] = false;
        }
        if(m >= n - 1 && m <= n*2 - 3){
            int sides = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i+1; j <= n; j++) {
                    if(j == i) continue;
                    else if(used[j+i-3] == false){
                        System.out.println(i+" "+j);
                        used[j+i-3] = true;
                        sides++;
                        break;
                    }
                    if (sides == m) break;
                }
                if (sides == m) break;
            }
        }
        else System.out.println("-1");
    }
}
