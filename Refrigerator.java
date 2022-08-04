package kattis;

import java.util.*;
import java.io.*;
import java.math.*;

public class Refrigerator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int aCost = sc.nextInt();
        double aCap = sc.nextInt();
        int bCost = sc.nextInt();
        double bCap = sc.nextInt();
        double total = sc.nextInt();
        
        //make a list of trips 0-max with car a
        //then make a list of same length of how many trips car b would need to make
        //loop through both and find the minCost
        
        int[] aTrips = new int[(int)(Math.ceil(total / aCap)) + 1];
        for (int i = 0; i < aTrips.length; i++) {
            aTrips[i] = i;
        }
        int[] bTrips = new int[aTrips.length];
        for (int i = 0; i < aTrips.length; i++) {
            bTrips[i] = (int)(Math.ceil((total - (i*aCap)) / bCap));
        }
        int minCost = Integer.MAX_VALUE;
        int aTrip = -1;
        int bTrip = -1;
        for (int i = 0; i < aTrips.length; i++) {
            if(aTrips[i]*aCost + bTrips[i]*bCost < minCost){
                aTrip = aTrips[i];
                bTrip = bTrips[i];
                minCost = aTrips[i]*aCost + bTrips[i]*bCost;
            }
        }
        System.out.println(aTrip + " " + bTrip + " " + minCost);
    }
}
