package kattis1;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketCompletedtwo {
	static int N;
	static ArrayList<ArrayList<Integer>> adjacentArray;
	
	static ArrayList<Integer> NumAndSize;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int M = sc.nextInt();
		//create a list for each adjacent nodes that we store
		
		
		//if vertices is even
		int sum = (N*(N-1))/2;
		
		
		//add the undirected graph into the adjacency list
		adjacentArray = new ArrayList<>();
		NumAndSize = new ArrayList<>();
		
		
		
		for(int x = 0; x < N; x++) {			
			adjacentArray.add(x, new ArrayList<>());		
		}
		//adds edges to undirected graph
		for(int x = 0; x < M; x++) {
			int src = (sc.nextInt()-1), dest = (sc.nextInt()-1);
			 adjacentArray.get(src).add(dest);		   
		     adjacentArray.get(dest).add(src);	
		}
		long time = (System.currentTimeMillis());
		
		//to driver
		Components();	
		
		int t = 0;
		//System.out.println(NumAndSize.get(1));
		for(int x: NumAndSize) {		
			//t += (N*(N-1))/2;	
			//These if statements could probably be reduce
			if(x%2==0) {				
				int f = (((x/2)-1)* x)+ (x/2);
				t+=f;
			} else {
				int f = ((x-1)/2)*x;
				t+=f;
			}	
		}
		
		
		System.out.println("Island size = "+ NumAndSize);
		System.out.println();
		System.out.println(t + " / " + sum);	
		System.out.println((double)t/sum);
		
				
			
		//System.out.println(adjacentArray.size());
		System.out.println("total time: "+(System.currentTimeMillis()-time) +"ms");
	}
	
	
	
	
	
    static void DFS(int v, boolean[] visited) {
        // Mark the current node as visited and print it
        visited[v] = true;
        count++;   // keeps a count of number of vertices per
        System.out.print(v + " ");
        // adjacent to this vertex
        for (int x : adjacentArray.get(v)) {
            if (!visited[x]) {
                DFS(x, visited);
            }    
        }        
    }
    
static int count = 0;

    //Driver method
    static void Components()
    {
        // Mark all the vertices as not visited  	
        boolean[] visited = new boolean[N];     
        for (int v = 0; v < N; ++v) {
            if (!visited[v]) {                     
                DFS(v, visited);   
                
                //System.out.println(count);
                NumAndSize.add(count); /* This keeps track of how many connected 
                vertices there are on each island */
                count = 0;     
                System.out.println();
            }
        }
    }
	
}