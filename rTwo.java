package kattis;

import java.util.*;
import java.io.*;

public class rTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), s = sc.nextInt();
        
        int x = s*2 - r;
        System.out.println(x);
    }
}
