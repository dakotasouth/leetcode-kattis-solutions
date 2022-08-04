package kattis;

import java.util.*;
import java.io.*;

public class Trik {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 1;
        String[] line = sc.next().split("");
        for (int i = 0; i < line.length; i++) {
            if(x == 1){
                if(line[i].compareTo("A") == 0){
                    x = 2;
                }
                else if(line[i].compareTo("C") == 0){
                    x = 3;
                }
            }
            else if(x == 2){
                if(line[i].compareTo("B") == 0){
                    x = 3;
                }
                else if(line[i].compareTo("A") == 0){
                    x = 1;
                }
            }
            else{
                if(line[i].compareTo("B") == 0){
                    x = 2;
                }
                else if(line[i].compareTo("C") == 0){
                    x = 1;
                }
            }
        }
        System.out.println(x);
    }
}
