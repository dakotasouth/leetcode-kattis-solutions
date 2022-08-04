package kattis;

import java.util.*;
import java.io.*;

public class gcvwr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double g = sc.nextInt();
        int t = sc.nextInt();
        int n = sc.nextInt();
        // subtract truck weight and find the 90%
        g -= t;
        g = g * .9;
        
        //subtract n items
        for (int i = 0; i < n; i++) {
            g -= sc.nextInt();
        }
        //cast back to an int
        System.out.println((int)g);
    }
}
