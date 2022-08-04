package kattis;

import java.util.*;
import java.io.*;

public class SymmetricOrder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int set = 0;
        while(n != 0){
            set++;
            LinkedList<String> names = new LinkedList<>();
            for (int i = 0; i <= n; i++) {
                names.add(sc.nextLine());                
            }
            System.out.println("SET "+ set);             
            for (int i = 1; i <= n; i++) {
                if ( i % 2 != 0 ){
                    System.out.println(names.get(i));                    
                }
            }
            for (int i = n; i > 0; i--) {
                if(i%2 == 0){
                    System.out.println(names.get(i));
                }
            }            
            n = sc.nextInt();
        }                
    } 
}