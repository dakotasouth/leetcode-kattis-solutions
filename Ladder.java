package kattis;

import java.util.*;
import java.io.*;

public class Ladder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double theta = sc.nextDouble();
        theta = Math.toRadians(theta);
        
        System.out.println((int)(Math.ceil(h / Math.sin(theta))));
    }
}
