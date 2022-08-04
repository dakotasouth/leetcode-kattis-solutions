package kattis;

import java.util.*;
import java.io.*;

public class Modulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            nums.add(sc.nextInt() % 42);
        }
        System.out.println(nums.size());
    }
}
