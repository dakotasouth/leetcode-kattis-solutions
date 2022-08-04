package kattis;

import java.util.*;
import java.io.*;

public class SmoothieStand {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        /*
        array of ingred amounts
        maxprof = 0;
        for each recipe:
            find the limiting factor//
            
            for each ingredient:
                if curr is smaller than lim, lim = curr
            
            if lim * price > maxprof, maxprof = price
        
        */
        int[] ingred = new int[k];
        int maxprof = 0;
        
        for (int i = 0; i < k; i++) {
            ingred[i] = sc.nextInt();
            //System.out.println(ingred[i]);
        }
        
        //for each recipe
        for (int i = 0; i < r; i++) {
            int lim = Integer.MAX_VALUE;
            //for each ingredient
            for (int j = 0; j < k; j++) {
                int amount = sc.nextInt();
                if (amount == 0) continue;
                //System.out.print(amount);
                //System.out.println(ingred[j]);
                if(ingred[j] / amount < lim) lim = ingred[j] / amount;
                //System.out.println(lim);
            }
            //System.out.println("lim = " + lim);
            int price = sc.nextInt();
            if (lim * price > maxprof) maxprof = lim * price;
        }
        System.out.println(maxprof);
    }
}
