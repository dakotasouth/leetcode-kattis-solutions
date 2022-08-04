package kattis1;

import java.util.*;
import java.io.*;

public class QuickBrownFox {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String[] line = sc.nextLine().split("");
            boolean[] seen = new boolean[26];
            char[] alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            for (int j = 0; j < line.length; j++) {
                System.out.println(line[j]);
                for (int k = 0; k < alph.length; k++) {
                    if(line[j].compareTo(String.valueOf(alph[j])) == 0) seen[j] = true; break;
                }
            }
            boolean pan = true;
            ArrayList<String> missing = new ArrayList<>();
            for (int j = 0; j < seen.length; j++) {
                if(seen[j] == false) {
                    System.out.println(j);
                    missing.add(line[j]);
                    pan = false;
                }
            }
            if(pan) System.out.println("pangram");
            else{
                System.out.print("missing ");
                for (String s: missing) {
                    System.out.print(s);
                }
                System.out.println();
            }
        }
    }
}
