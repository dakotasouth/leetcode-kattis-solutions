package kattis;

import java.util.*;
import java.io.*;

public class Zoom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int k = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i%k==0) System.out.print(sc.nextInt() + " ");
            else sc.nextInt();
        }
        System.out.println();
    }
}
