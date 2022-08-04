package kattis;

import java.util.*;
import java.io.*;

public class MixedFractions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int den = sc.nextInt();
        while(num != 0 && den != 0){
            int whole = num / den;
            int rem = num % den;
            System.out.println(whole+" "+rem+" / "+den);
            num = sc.nextInt();
            den = sc.nextInt();
        }
    }
}
