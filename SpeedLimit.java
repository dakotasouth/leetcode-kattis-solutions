package kattis;

import java.util.*;
import java.io.*;

public class SpeedLimit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while (n != -1){
            int lDist = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int mph = sc.nextInt();
                int currdist = sc.nextInt();
                int dist = currdist - lDist;
                sum += dist * mph;
                lDist = currdist;
            }
            System.out.println(sum + " miles");
            n = sc.nextInt();
        }
    }
}
