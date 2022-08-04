package kattis1;

import java.util.*;
import java.io.*;

public class NoonerizedSpumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] equ = sc.nextLine().split(" ");
        String a = equ[0]; String b = equ[2]; String c = equ[4];
        HashMap<String,String> aPrefs = new HashMap<>();
        HashMap<String,String> bPrefs = new HashMap<>();
        HashMap<String,String> cPrefs = new HashMap<>();
        /*
        aPrefs.put("0", a);
        bPrefs.put("0", b);
        cPrefs.put("0", c);
        */
        
        for (int i = 1; i < a.length(); i++) {
            //System.out.println(a.substring(0,i) + " " + a.substring(i));
            aPrefs.put(a.substring(0,i), a.substring(i));
        }
        for (int i = 1; i < b.length(); i++) {
            //System.out.println(b.substring(0,i) + " " + b.substring(i));
            bPrefs.put(b.substring(0,i), b.substring(i));
        }
        for (int i = 1; i < c.length(); i++) {
            //System.out.println(c.substring(0,i) + " " + c.substring(i));
            cPrefs.put(c.substring(0,i), c.substring(i));
        }
        //System.out.println();
        boolean solved = false;
        //need to check adding prefix from only one number
        if(equ[1].equals("+")){
            for(String i: aPrefs.keySet()){
                if(solved) break;
                for(String j: bPrefs.keySet()){
                    long newA = Long.parseLong(j + aPrefs.get(i));
                    long newB = Long.parseLong(i + bPrefs.get(j));
                    if(newA > Integer.MAX_VALUE || newB > Integer.MAX_VALUE) continue;
                    //System.out.println(newA + " " + newB);
                    if(newA + newB == Long.parseLong(c)){
                        solved = true;
                        System.out.println(newA + " + " + newB + " = " + c);
                        break;
                    }
                }
                if(solved) break;
                for(String k: cPrefs.keySet()){
                    long newA = Long.parseLong(k + aPrefs.get(i));
                    long newC = Long.parseLong(i + cPrefs.get(k));
                    if(newA > Integer.MAX_VALUE || newC > Integer.MAX_VALUE) continue;
                    //System.out.println(newA + " " + newC);
                    if(newA + Long.parseLong(b) == newC){
                        solved = true;
                        System.out.println(newA + " + " + b + " = " + newC);
                        break;
                    }
                }     
            }
            //if first for loop solved it then were done
            if(!solved){
                for(String i: bPrefs.keySet()){
                    for(String j: cPrefs.keySet()){
                        long newB = Long.parseLong(j + bPrefs.get(i));
                        long newC = Long.parseLong(i + cPrefs.get(j));
                        if(newB > Integer.MAX_VALUE || newC > Integer.MAX_VALUE) continue;
                        //System.out.println(newB + " " + newC);
                        if(Long.parseLong(a) + newB == newC){
                            solved = true;
                            System.out.println(a + " + " + newB + " = " + newC);
                            break;
                        }
                    }
                       
                }                
            }
        }
        else if(equ[1].equals("*")){
            for(String i: aPrefs.keySet()){
                if (solved) break;
                for(String j: bPrefs.keySet()){
                    long newA = Long.parseLong(j + aPrefs.get(i));
                    long newB = Long.parseLong(i + bPrefs.get(j));
                    if(newA > Integer.MAX_VALUE || newB > Integer.MAX_VALUE) continue;
                    //System.out.println(newA + " " + newB);
                    if(newA * newB == Long.parseLong(c)){
                        solved = true;
                        System.out.println(newA + " * " + newB + " = " + c);
                        break;
                    }
                }
                if(!solved){
                    for(String j: cPrefs.keySet()){
                        long newA = Long.parseLong(j + aPrefs.get(i));
                        long newC = Long.parseLong(i + cPrefs.get(j));
                        if(newA > Integer.MAX_VALUE || newC > Integer.MAX_VALUE) continue;
                        //System.out.println(newA + " " + newC);
                        if(newA * Long.parseLong(b) == newC){
                        solved = true;
                        System.out.println(newA + " * " + b + " = " + newC);
                        break;
                        }
                    } 
                }
            }
            //if first for loop solved it then were done
            if(!solved){
                for(String i: bPrefs.keySet()){
                    for(String j: cPrefs.keySet()){
                        long newB = Long.parseLong(j + bPrefs.get(i));
                        long newC = Long.parseLong(i + cPrefs.get(j));
                        if(newB > Integer.MAX_VALUE || newC > Integer.MAX_VALUE) continue;
                        if(Long.parseLong(a) * newB == newC){
                            solved = true;
                            System.out.println(a + " * " + newB + " = " + newC);
                            break;
                        }
                    }
                       
                }                
            }
        }
    }
}
