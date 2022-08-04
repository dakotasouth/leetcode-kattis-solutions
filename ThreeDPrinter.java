package kattis;

import java.util.*;
import java.io.*;

public class ThreeDPrinter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        int printers = 1;
        int days = 0;
        int stats = 0;
        while(stats < n){
            if (printers <= n/2){
                printers *= 2;
                days++;
            }
            else if (stats < n) {
                stats += printers;
                days++;
            }
        }
        
        System.out.println(days);
    }
}
