package kattis;

import java.util.*;
import java.io.*;

public class MillionareMadness {
    public static class Stack implements Comparable<Stack>{
        int ht;
        int minLadder = Integer.MAX_VALUE;
        boolean marked = false;
        int x, y;
        
        Stack(int h, int xx, int yy){
            ht = h; x = xx; y = yy;
        }

        @Override
        public int compareTo(Stack o) {
            return minLadder - o.minLadder;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //dijkstra algorithm
        int row = sc.nextInt();
        int col = sc.nextInt();
        Stack[][] grid = new Stack[row][col];
        PriorityQueue<Stack> pq = new PriorityQueue<>();
        
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                Stack s = new Stack(sc.nextInt(), r, c);
                grid[r][c] = s;
            }
        }
        
        Stack src = grid[0][0];
        src.minLadder = 0;
        //src.marked = true;
        Stack curr = src;
        //int minLadder = 0;
        int min = Integer.MAX_VALUE;
        Stack minStack = src;
        
        while(grid[row-1][col-1].marked == false){
            if (!curr.marked){
                ArrayList<Stack> nbrs = new ArrayList<>();
                if(curr.x > 0) nbrs.add(grid[curr.x - 1][curr.y]);
                if(curr.x < row - 1) nbrs.add(grid[curr.x + 1][curr.y]);
                if(curr.y > 0) nbrs.add(grid[curr.x][curr.y - 1]);
                if(curr.y < col - 1) nbrs.add(grid[curr.x][curr.y + 1]);



                //min = Integer.MAX_VALUE;
                for(Stack nbr: nbrs){
                    if(nbr.marked == false){
                        int newH = nbr.ht - curr.ht;
                        if (newH <= 0){ //if he has to jump down and the current ladder height is better than the next
                            //check if height is the same
                            if (curr.minLadder <= nbr.minLadder) nbr.minLadder = curr.minLadder;
                        }
                        else if(newH < curr.minLadder && curr.minLadder < nbr.minLadder){
                            nbr.minLadder = curr.minLadder;
                        }
                        else if(newH >= curr.minLadder && newH < nbr.minLadder){
                            nbr.minLadder = newH;
                        }  
                    }
                    
                    pq.add(nbr);
                }
            }
            //System.out.println(curr.ht + " " + curr.minLadder);
            curr.marked = true;
            curr = pq.poll();
        }
        System.out.println(grid[row-1][col-1].minLadder);
    }
}
