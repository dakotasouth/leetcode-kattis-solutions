package kattis;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Safehouses {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //put all input into an array
        int n = sc.nextInt();
        sc.nextLine();
        String[] grid = new String[n*n];
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split("");
            for (int j = 0; j < n; j++) {
                grid[i*n + j] = line[j];
                //System.out.print(grid[(i+1)*j]);
            }
        }
        /*
        for (int i = 0; i < n*n; i++) {
            System.out.print(grid[i]);
        }*/
        
        ArrayList<ArrayList<Integer>> houses = new ArrayList<>();
        ArrayList<ArrayList<Integer>> spies = new ArrayList<>();
        
        for (int i = 0; i < n*n; i++) {
            //System.out.println(grid[i]);
            //if (grid[i] == null) continue;
            if (grid[i].compareTo("S") == 0){
                ArrayList<Integer> coord = new ArrayList<>();
                int x = i%n;
                int y = i/n;
                coord.add(x);
                coord.add(y);
                spies.add(coord);
            }
            else if(grid[i].compareTo("H") == 0){
                ArrayList<Integer> coord = new ArrayList<>();
                int x = i%n;
                int y = i/n;
                coord.add(x);
                coord.add(y);
                houses.add(coord);
            }
        }
        int max = 0;
        for (ArrayList<Integer> s: spies) {
            int closest = 1000000;
            for (ArrayList<Integer> h: houses){
                int dis = Math.abs(s.get(0) - h.get(0)) + Math.abs(s.get(1) - h.get(1));
                if (dis < closest) closest = dis;
            }
            if (closest > max) max = closest;
        }
        System.out.println(max);
    }
}
