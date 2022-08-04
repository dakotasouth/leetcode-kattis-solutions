package kattis;

import java.util.*;
import java.io.*;

public class Parking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int stores = sc.nextInt();
            ArrayList<Integer> nums = new ArrayList<>();
            for (int j = 0; j < stores; j++) {
                nums.add(sc.nextInt());
            }
            Collections.sort(nums);
            System.out.println((nums.get(nums.size() - 1) - nums.get(0)) * 2);
        }
    }
}
