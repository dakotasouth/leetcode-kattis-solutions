package kattis;

import java.util.*;
import java.io.*;

public class Pot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String num = sc.next();
            int pow = Integer.parseInt(num.substring(num.length() - 1));
            int number = Integer.parseInt(num.substring(0,num.length()-1));
            sum += Math.pow(number, pow);
        }
        System.out.println(sum);
    }
}
