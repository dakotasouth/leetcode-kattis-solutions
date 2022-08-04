package kattis;

import java.util.*;
import java.io.*;

public class PawnShop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] a = sc.nextLine().split(" ");
        String[] b = sc.nextLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        HashMap<String, Integer> disp = new HashMap<>();
        
        int st = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(i + " " + a[i]);
            disp.put(a[i], disp.getOrDefault(a[i], 0)+1);
            System.out.println(i + " " + b[i]);
            disp.put(b[i], disp.getOrDefault(b[i], 0)-1);
            if(disp.get(a[i]) == 0) disp.remove(a[i]);
            if(disp.get(b[i]) == 0) disp.remove(b[i]);
            
            if(disp.isEmpty()){
                if(i<n-1){
                    for (int j = st; j <= i; j++) {
                        System.out.print(b[j] + " ");
                    }System.out.print("# ");
                    st = i+1;
                }
                else{
                    for (int j = st; j <= i; j++) {
                        System.out.print(b[j]+" ");
                    }
                }
            }
        }
    }
}
