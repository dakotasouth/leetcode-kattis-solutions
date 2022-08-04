package kattis;

import java.util.*;
import java.io.*;

public class CountingStars {
    public static void search(int i, int j, char[][] grid, boolean[][] seen){
        if(i > 0 && grid[i-1][j] == '-' && seen[i-1][j] == false){
            seen[i-1][j] = true;
            search(i-1,j,grid,seen);
        }
        if(i < grid.length-1 && grid[i+1][j] == '-' && seen[i+1][j] == false){
            seen[i+1][j] = true;
            search(i+1,j,grid,seen);
        }
        if(j > 0 && grid[i][j-1] == '-' && seen[i][j-1] == false){
            seen[i][j-1] = true;
            search(i,j-1,grid,seen);
        }
        if(j < grid[i].length-1 && grid[i][j+1] == '-' && seen[i][j+1] == false){
            seen[i][j+1] = true;
            search(i,j+1,grid,seen);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int caseCount = 0;
        while(sc.hasNextInt()){
            caseCount++;
            int m = sc.nextInt();
            int n = sc.nextInt();
            sc.nextLine();
            char[][] grid = new char[m][n];
            
            for (int i = 0; i < m; i++) {
                char[] line = sc.nextLine().toCharArray();
                for (int j = 0; j < line.length; j++) {
                    grid[i][j] = line[j];
                }
            }
            /*
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(grid[i][j]);
                }
                System.out.println();
            }
*/
            int starCount = 0;
            boolean[][] seen = new boolean[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(grid[i][j] == '-' && seen[i][j] == false){
                        starCount++;
                        seen[i][j] = true;
                        search(i,j,grid,seen);
                    }
                }
            }
            System.out.println("Case "+caseCount + ": "+ starCount);
        }
    }
}
