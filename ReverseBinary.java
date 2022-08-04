package kattis;

import java.util.*;
import java.io.*;

public class ReverseBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        String[] bin = Integer.toBinaryString(n).split("");
        for (int i = 0; i < bin.length; i++) {
            num += Integer.parseInt(bin[i]) * Math.pow(2, i);
        }
        System.out.println(num);
    }
}
