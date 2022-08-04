package kattis;

import java.util.*;
import java.io.*;

public class HeadGuard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String[] line = sc.nextLine().split("");
            String letter = line[0];
            int count = 0;
            for (int i = 0; i < line.length; i++) {
                //System.out.println(line.length);
                if(i == line.length - 1){
                    if (line[i].equals(letter)){
                        //System.out.print("C1");
                        count++;
                        System.out.print(count);
                        System.out.print(letter);
                    }
                    else{
                        System.out.print(count+""+letter);
                        //System.out.print("C2");
                        count = 1;
                        letter = line[i];
                        System.out.print(count);
                        System.out.print(letter);
                    }
                }
                else{
                    if (line[i].equals(letter)){
                        //System.out.print("C3");
                        count++;
                    }
                    else{
                        //System.out.print("C4");
                        System.out.print(count);
                        System.out.print(letter);
                        letter = line[i];
                        count = 1;
                    } 
                }
            }
            System.out.println();
        }
    }
}
