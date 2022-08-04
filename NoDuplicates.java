package kattis;

import java.util.*;
import java.io.*;

public class NoDuplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> words = new HashSet<>();
        String[] line = sc.nextLine().split(" ");
        
        boolean notdup = true;
        
        for (int i = 0; i < line.length; i++) {
            if(words.add(line[i]) == false) {
                notdup = false;
                break;
            }
        }
        if(notdup) System.out.println("yes");
        else System.out.println("no");
    }
}
