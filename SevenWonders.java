package kattis;

import java.util.*;
import java.io.*;

public class SevenWonders {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] line = sc.next().split("");
        int t = 0;
        int g = 0;
        int c = 0;
        
        for (int i = 0; i < line.length; i++) {
            if(line[i].compareTo("T") == 0) t++;
            else if(line[i].compareTo("G") == 0) g++;
            else if(line[i].compareTo("C") == 0) c++;
        }
        
        int total = t*t + g*g + c*c;
        
        while(t > 0 && g > 0 && c > 0){
            total += 7;
            t--;
            g--;
            c--;
        }
        System.out.println(total);
        
    }
}
