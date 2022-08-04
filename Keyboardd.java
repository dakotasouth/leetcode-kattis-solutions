package kattis;

import java.util.*;
import java.io.*;

public class Keyboardd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> sList = new ArrayList<>();
        ArrayList<String> tList = new ArrayList<>();
        
        String[] sLine = sc.nextLine().split("");
        String[] tLine = sc.nextLine().split("");
        
        for (String s: sLine) sList.add(s);
        for (String t: tLine) tList.add(t);
        
        
        for(String t: tLine){
            if (sList.contains(t)){
                tList.remove(tList.get(t.));
            }
            
        }
        for (String t: tList) System.out.println(t);
        System.out.println();
    }
}
