package kattis;

import java.util.*;
import java.io.*;

public class BossBomber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pillars = sc.nextInt();
        if (pillars == 1){
            System.out.println(1);
        }
        else if (pillars % 2 == 0){
            System.out.println(pillars/2);
        }
        else{
            System.out.println((pillars/2) + 2);
        }
    }
}
