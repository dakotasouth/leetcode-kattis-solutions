package kattis;

import java.util.*;
import java.io.*;

public class Sibice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), w = sc.nextInt(), h = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int len = sc.nextInt();
            if (len <= w || len <= h || len <= Math.sqrt(w*w + h*h)) System.out.println("DA");
            else System.out.println("NE");
        }
    }
}
