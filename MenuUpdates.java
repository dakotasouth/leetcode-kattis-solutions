package kattis;

import java.util.*;
import java.io.*;

public class MenuUpdates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int minDays = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        
        int[] days = new int[n + minDays];
        TreeSet<Integer> openNums = new TreeSet<>();
        //Arrays.fill(days, 0);
        
        int menNum = 0;
        int offset = 0;
        
        for (int i = 0; i < n; i++) {
            if(days[i] > 0){
                openNums.add(days[i]);
            }
            String[] comm = sc.nextLine().split(" ");
            if (comm[0].equals("a")){
                if (!openNums.isEmpty()){
                    System.out.println(openNums.pollFirst());
                }
                else {
                    menNum++;
                    System.out.println(menNum);
                }
            }
            else if(comm[0].equals("r")){
                days[i+minDays] = Integer.parseInt(comm[1]);
                
            }
        }   
    }
}
