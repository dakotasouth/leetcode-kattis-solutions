package kattis;

import java.util.*;
import java.io.*;

public class Zamka {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int x = sc.nextInt();
        
        for (int i = low; i <= high; i++) {
            String[] num = String.valueOf(i).split("");
            int sum = 0;
            for (int j = 0; j < num.length; j++) {
                sum += Integer.valueOf(num[j]);
            }
            if(sum == x) {
                System.out.println(i);
                break;
            } 
        }
        for (int i = high; i >= low; i--) {
            String[] num = String.valueOf(i).split("");
            int sum = 0;
            for (int j = 0; j < num.length; j++) {
                sum += Integer.valueOf(num[j]);
            }
            if(sum == x) {
                System.out.println(i);
                break;
            }
        }
    }
}
