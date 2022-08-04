package kattis1;

import java.util.*;
import java.io.*;

public class Subwayy {
    static class Edge{
        Stop to = null;
        int wt;
        Edge(int wtt, Stop too){
            wt = wtt;
            to = too;
        }
    }
    static class Stop implements Comparable<Stop>{
        int x;
        int y;
        boolean marked = false;
        int cost = Integer.MAX_VALUE;
        
        Stop(int xx, int yy){
            x = xx;
            y = yy;
        }
        
        ArrayList<Edge> adj = new ArrayList<>();
        
        @Override
        public int compareTo(Stop o) {
            if (cost < o.cost) return -1;
            else if(cost > o.cost) return 1;
            else return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Stop> stops = new ArrayList<>();
        int hX = sc.nextInt();
        int hY = sc.nextInt();
        int sX = sc.nextInt();
        int sY = sc.nextInt();
        sc.nextLine();
        while(sc.hasNextLine()){
            int x = sc.nextInt();
            int y = sc.nextInt();
            while(x != -1 && y != -1){
                stops.add(new Stop(x, y));
            }
        }
    }
}
