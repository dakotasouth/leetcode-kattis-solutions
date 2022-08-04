package kattis;

import java.util.*;
import java.io.*;

public class ThePlank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for (int i = 0; i <= n; i++) {
            if(i < 4){
                continue;
            }
            else{
                //System.out.println(i);
                arr[i] = arr[i-3] + arr[i-2] + arr[i-1];
            }
            //System.out.print(arr[i]);
        }
        //System.out.println();
        System.out.println(arr[n]);
    }
}
