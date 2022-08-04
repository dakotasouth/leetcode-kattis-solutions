package kattis;

import java.util.*;
import java.io.*;

public class Akcija {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr, (a,b)-> b-a);
        //Collections.reverse(arr);
        
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if ((i+1) % 3 != 0) sum += arr.get(i);
        }
        System.out.println(sum);
    }
}
