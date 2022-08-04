package kattis;

import java.util.*;
import java.io.*;

public class FindingAnA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split("");
        boolean a = false;
        for (int i = 0; i < line.length; i++) {
            if(a) System.out.print(line[i]);
            else if(line[i].equals("a")){
                System.out.print("a");
                a = true;
            }
        }
        System.out.println();
    }
}
