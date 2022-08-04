package kattis;

import java.util.*;
import java.io.*;

public class Romans {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(Math.round(sc.nextDouble() * (5280000.0 / 4854.0)));
        
        //or add .5 and cast to int
    }
}
