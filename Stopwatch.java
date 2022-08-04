package kattis;

import java.util.*;
import java.io.*;

public class Stopwatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int press = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < press/2; i++) {
            int start = sc.nextInt();
            int stop = sc.nextInt();
            sum += stop - start;
        }
        System.out.println(press % 2 == 0 ? sum : "still running");
    }
}
