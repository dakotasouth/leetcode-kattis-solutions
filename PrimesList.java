package kattis;

import java.util.*;
import java.io.*;

public class PrimesList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = 2;
        int[] arr = new int[10001];
        while (count <= 100000){
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime){
                arr[count] = n;
                count++;
            }
            n++;
        }
        for(int i: arr) System.out.print(i + ",");
    }
}
