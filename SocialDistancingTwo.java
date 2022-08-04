package kattis;

import java.util.*;
import java.io.*;

public class SocialDistancingTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int seats = sc.nextInt(); int occ = sc.nextInt();
        boolean[] occupied = new boolean[seats];
        for (int i = 0; i < occ; i++) {
            int curr = sc.nextInt();
            occupied[curr-1] = true;
        }
        int count = 0;
        for (int i = 0; i < seats; i++) {
            //handles case of 1 seat
            if(seats == 1 && occupied[0] == false){
                count++;
            }
            else{
                //first seat
                if(i == 0){
                    if(occupied[1] == false && occupied[seats-1] == false && occupied[0] == false){
                        count++;
                        occupied[0] = true;
                    }
                }
                else if(i == seats-1){
                    if(occupied[i] == false && occupied[0] == false && occupied[seats-2] == false){
                        count++;
                        //dont think i need this
                        occupied[seats-1] = true;
                    }
                }
                else{
                    if(occupied[i] == false && occupied[i-1] == false && occupied[i+1] == false){
                        count++;
                        occupied[i] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
