package kattis;

import java.util.*;
import java.io.*;

public class VisuAlgo {
    static class Vertex implements Comparable<Vertex>{
        int idx;
        int cost;
        boolean marked;
        int paths = 0;
        
        ArrayList<Edge> adj = new ArrayList<>();
        Vertex(){
            marked = false;
            cost = Integer.MAX_VALUE;
            
        }

        @Override
        public int compareTo(Vertex o) {
            if (cost < o.cost) return -1;
            else if (cost > o.cost) return 1;
            else return 0;
        }

        
    }
    static class Edge{
        int wt;
        Vertex to = null;
        Edge(Vertex too,int wtt){
            wt = wtt;
            to = too;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int v = sc.nextInt();
        int e = sc.nextInt();
        Vertex[] graph = new Vertex[v];
        PriorityQueue<Vertex> pq = new PriorityQueue<>();
        
        //construct the graph
        for (int i = 0; i < v; i++) {
            graph[i] = new Vertex();
            graph[i].idx = i;
        }
        //add all edges to all the nodes
        for (int i = 0; i < e; i++) {
            int fro = sc.nextInt();
            int to = sc.nextInt();
            int wtt = sc.nextInt();
            graph[fro].adj.add(new Edge(graph[to], wtt));
        }
        // set s and t
        Vertex currV = graph[sc.nextInt()];
        currV.cost = 0;
        currV.paths = 1;
        Vertex tgt = graph[sc.nextInt()];
        
        
        int newCost = 0;
        
        currV.marked = true;
        
        //dijkstra
        pq.add(currV);
        while(!tgt.marked && !pq.isEmpty()){
            currV = pq.poll();
            currV.marked = true;
            for(Edge nbr: currV.adj){
                if(!nbr.to.marked){
                    newCost = currV.cost + nbr.wt;
                    
                    if (newCost < nbr.to.cost) {
                        nbr.to.cost = newCost;
                        nbr.to.paths = currV.paths;
                        
                        //System.out.println(newCost);
                    }
                    // if the costs are equal add to path count
                    else if (newCost == nbr.to.cost) nbr.to.paths += currV.paths;
                    //System.out.println(currV.idx + " " + nbr.to.cost + " " + nbr.to.paths);
                    if (!pq.contains(nbr.to)) pq.add(nbr.to);
                }
            }
        }
        //System.out.println(tgt.cost);
        System.out.println(tgt.paths);
    }
}
