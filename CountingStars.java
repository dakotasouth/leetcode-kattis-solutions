 
import java.util.*;
import java.io.*;

public class CountingStars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int caseCount = 0;
        while(sc.hasNextInt()){
            caseCount++;
            int m = sc.nextInt();
            int n = sc.nextInt();
            char[][] grid = new char[m][n];
            boolean[][] seen = new boolean[m][n];

            for (int i = 0; i < m; i++) {
                char[] line = sc.nextLine().toCharArray();
                for (int j = 0; j < n; j++) {
                    System.out.println(j);
                    grid[i][j] = line[j];
                } 
            }
            //find every dash
            //check if next to other dash
            //check if those dashes have been checked
            //if not, star count + 1
            int starCount = 0;
            char w = "-";
            
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(i+" "+j);
                    System.out.println(grid[i][j]);
                    if(grid[i][j] == ){
                        if(seen[i][j] == false && seen[i-1][j] == false && seen[i][j-1] == false && seen[i+1][j] == false && seen[i][j+1] == false){
                            starCount++;
                        }
                        seen[i][j] = true;
                        if(seen[i-1][j] == false && grid[i-1][j].compareTo("-") == 0) seen[i-1][j] = true;
                        if(seen[i+1][j] == false && grid[i+1][j].compareTo("-") == 0) seen[i+1][j] = true;
                        if(seen[i][j-1] == false && grid[i][j-1].compareTo("-") == 0) seen[i][j-1] = true;
                        if(seen[i][j+1] == false && grid[i][j+1].compareTo("-") == 0) seen[i][j+1] = true;
                    }
                }
            }
            System.out.println("Case "+caseCount+": "+starCount);
        }
        
    }
}
