package kattis;

import java.util.*;
import java.io.*;

public class Simone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        HashMap<Integer, Integer> colors = new HashMap<>();
        for (int i = 1; i <= k ; i++) {
            colors.put(i, 0);
        }
        for (int i = 0; i < n; i++) {
            int col = sc.nextInt();
            int curr = colors.get(col);
            colors.replace(col, curr + 1);
        }
        
        int min = Integer.MAX_VALUE;
        
        for(Integer val: colors.values()) if(val < min) min = val;
        
        ArrayList<Integer> least = new ArrayList<>();
        
        for(Integer key: colors.keySet()) if (colors.get(key) == min) least.add(key);
        
        least.sort((a,b) -> a-b);
        
        System.out.println(least.size());
        
        least.forEach(a -> System.out.print(a + " "));
        System.out.println("");
    }
}
