package kattis;

import java.util.*;
import java.io.*;

public class Planina {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double points = 4;
        for (int i = 0; i < n; i++) {
            points = Math.pow(Math.sqrt(points) + Math.sqrt(points) - 1, 2);
        }
        System.out.println((int)(points));
    }
}
