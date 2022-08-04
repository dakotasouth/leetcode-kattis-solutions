package kattis;

import java.util.*;
import java.io.*;

public class SimonSays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String lines = sc.nextLine();
            //System.out.println(lines);
            if (lines.length() > 10 && lines.substring(0,10).compareTo("Simon says") == 0){
                System.out.println(lines.substring(11,lines.length()));
            }
        }
    }
}
