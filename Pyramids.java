package kattis;

import java.util.*;
import java.io.*;
import java.math.*;

public class Pyramids {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        double pSize = 1;
        int h = 1;
        n -= 1;
        pSize = 9;
        while(n >= pSize){
            n -= pSize;
            h++;
            pSize = Math.pow((Math.sqrt(pSize) + 2), 2);
        }
        System.out.println(h);
        
    }
}
