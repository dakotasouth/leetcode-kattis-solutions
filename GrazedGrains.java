package kattis;

import java.util.*;
import java.io.*;

public class GrazedGrains {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        boolean[][] grid = new boolean[3001][3001];
        double area = 0;
        int[][] circles = new int[n][3];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt() *100 + 1000;
            int y = sc.nextInt() *100 + 1000;
            int r = sc.nextInt() *100;
            circles[i][0] = x; circles[i][1] = y; circles[i][2] = r;
            System.out.println(Arrays.toString(circles[i]));
        }
        
        for (int i = 0; i <= 3000; i++) {
            for (int j = 0; j <= 3000; j++) {
                for (int k = 0; k < n; k++) {
                    int x = circles[k][0]; int y = circles[k][1]; int r = circles[k][2];
                    System.out.println(x + " " + y + " " + r);
                    if(Math.sqrt(Math.pow((i-x), 2) + Math.pow((k-y), 2)) <= r){
                        area++;
                        grid[i][j] = true;
                    }
                }
            }
        }
        
        /*
        for (int i = 0; i < 3000; i++) {
            for (int j = 0; j < 3000; j++) {
                if(grid[i][j] == true) area++;
            }
        }*/
        System.out.println(area / 10000);
    }
}
