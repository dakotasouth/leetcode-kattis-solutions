package kattis1;

import java.util.*;
import java.io.*;

public class Mult {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int next = sc.nextInt();
            if (next % num == 0) {
                System.out.println(next);
                num = sc.nextInt();
                i++;
            }
        }
    }
}
