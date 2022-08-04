package kattis;

import java.util.*;
import java.io.*;

public class ShatteredCake {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int p = sc.nextInt();
        int area = 0;
        for (int i = 0; i < p; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            area += a*b;
        }
        System.out.println(area / width);
    }
}
