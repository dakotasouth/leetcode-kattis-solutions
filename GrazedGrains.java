package kattis1;

import java.util.*;
import java.io.*;

public class GrazedGrains {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean[][] grid = new boolean[3000][3000];
        double area = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt() *100 + 1500;
            int y = sc.nextInt() *100 + 1500;
            int r = sc.nextInt() *100;
            
            for (int j = x - r; j < x+r+1; j++) {
                for (int k = y - r; k < y+r+1; k++) {
                    if (grid[j][k] == true) continue;
                    else if((int)Math.sqrt(Math.pow((j-x),2) + Math.pow((k-y), 2)) < r){
                        area++;
                        grid[j][k] = true;
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
