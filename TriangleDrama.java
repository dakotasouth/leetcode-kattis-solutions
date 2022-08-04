package kattis;

import java.util.*;
import java.io.*;

public class TriangleDrama {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] rp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rp[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        int[] tri = {0,0,0};
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    //System.out.println(rp[i][j] * rp[j][k] * rp[k][i]);
                    if((rp[i][j] * rp[j][k] * rp[k][i]) > max) {
                        tri[0] = i+1;
                        tri[1] = j+1;
                        tri[2] = k+1;
                        max = rp[i][j] * rp[j][k] * rp[k][i];
                    }
                    //System.out.println("Max: " + max);
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(tri[i] + " ");
        }
        System.out.println();
    }
}
