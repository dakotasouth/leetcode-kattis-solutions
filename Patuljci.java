package kattis;

import java.util.*;
import java.io.*;

public class Patuljci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int curr = sc.nextInt();
            list.add(curr);
            sum += curr;
        }
        //Collections.sort(list);
        int diff = sum - 100;
        int fake1 = 0;
        int fake2 = 0;
        for(Integer i: list){
            for(Integer j: list){
                if(!i.equals(j) && i+j == diff){
                    fake1 = list.indexOf(i);
                    fake2 = list.indexOf(j);
                }
            }
        }
        list.remove(list.get(fake1));
        list.remove(list.get(fake2));
        for(Integer i: list) System.out.println(i);
    }
}
