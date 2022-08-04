package kattis;

import java.util.*;
import java.io.*;

public class Apaxiaaans {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] name = sc.next().split("");
        ArrayList<Integer> q = new ArrayList<>();
        for (int i = 1; i < name.length; i++) {
            if(name[i-1].compareTo(name[i]) == 0) q.add(i-1);
        }
        for (int i = 0; i < name.length; i++) {
            if(!q.contains(i)) System.out.print(name[i]);
        }
        System.out.println();
    }
}
