package kattis;

import java.util.*;
import java.io.*;

public class WhoGoesThere {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int m = sc.nextInt();
        
        int[] schools = new int[m];
        
        for (int i = 0; i < m; i++) {
            schools[i] = sc.nextInt();
        }
        
        int[] teams = new int[m];
        Arrays.fill(teams, 0);
        int idx = 0;
        int teamsReg = 0;
        int fullyReg = 0;
        
        while(teamsReg < n && fullyReg < m){
            if(schools[idx])
        }
    }
}
