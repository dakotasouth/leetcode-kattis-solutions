package kattis;

import java.util.*;
import java.io.*;

public class Coldputer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() < 0) sum++;
        }
        System.out.println(sum);
    }
}
