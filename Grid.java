package kattis;

import java.util.*;
import java.io.*;

public class Grid {
    public static Scanner sc = new Scanner(System.in);
    public static class Point{
        int k, m;
        public Point(int k, int m){
            this.k = k;
            this.m = m;
        }
    }
    public static class Cell{
        int x;
        int y;        
        public Cell(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public static void main(String[] args){
        Queue <Cell> q = new LinkedList<>();
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        boolean[][] seen = new boolean[col][row];
        Point[][] grid = new Point[col][row];
        for (int i = 0; i < row; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < col; j++) {
                grid[j][i] = new Point(Integer.parseInt(line.charAt(j)+""),-1);
            }
        }
        q.add(new Cell(0,0));
        seen[0][0] = true;
        grid[0][0].m = 0;
        int[] dx = {1,-1,0,0}, dy = {0,0,1,-1};
        while(!seen[col-1][row-1] && !q.isEmpty()){
            Cell ce = q.poll();
            Point curr = grid[ce.x][ce.y];
            for (int i = 0; i < 4; i++) {
                int k = curr.k;
                if(ce.x+dx[i]*k < col && ce.x+dx[i]*k >= 0 && ce.y+dy[i]*k<row && ce.y + dy[i]*k >=0){
                    if(!seen[ce.x+dx[i]*k][ce.y]){
                        seen[ce.x+dx[i]*k][ce.y+dy[i]*k] = true;
                        grid[ce.x+dx[i]*k][ce.y+dy[i]*k].m = curr.m +1;
                        q.add(new Cell(ce.x+dx[i]*k, ce.y+dx[i]*k));
                    }
                }
            }
        }
        System.out.println(grid[col-1][row-1]);
    }
    
}
