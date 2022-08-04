package kattis;

import java.util.*;
import java.io.*;

public class OneChicken {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt(), chkn = sc.nextInt();
        int left = chkn - people;
        if (left > 1) System.out.println("Dr. Chaz will have " + left + " pieces of chicken left over!");
        else if(left == 1) System.out.println("Dr. Chaz will have " + left + " piece of chicken left over!");
        else if(left < -1) System.out.println("Dr. Chaz needs " + Math.abs(left) + " more pieces of chicken!");
        else System.out.println("Dr. Chaz needs " + Math.abs(left) + " more piece of chicken!");
    }
}
