package kattis1;

import java.util.*;
import java.io.*;

public class StampCombinations {
    Scanner sc = new Scanner(System.in);
    public int c = sc.nextInt();
    public int q = sc.nextInt();
        
    public int[] stamps = new int[c];
    public int[] stampsRev = new int[c];
    
    public static boolean canStamp(int sum, int idx1, int idx2){
        if (sum+stamps[idx1] > n) return false;
        if (sum+stampsRev[idx2] > n) return false;
    }
    public static void main(String[] args){
        for (int i = 0; i < c; i++) {
            stamps[i] = sc.nextInt();
            stampsRev[c-1-i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int need = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < j; k++) {
                    if (sum + stampsRev[k] > need) {
                        break;
                    }
                    else if(sum + stampsRev[k] == need) {
                        //break entirely because true
                        break;
                    }
                    else sum+=
                    
                }
                if (sum +)
            }
        }
    }
}
