package kattis;

import java.util.*;
import java.io.*;

public class DamagedEquation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        ArrayList<String> equ = new ArrayList<>();
        
        if (b != 0 && d != 0){            
            if (a+b == c+d) equ.add(a+" + "+b+" = "+c+" + "+d);
            if (a+b == c-d) equ.add(a+" + "+b+" = "+c+" - "+d);
            if (a+b == c*d) equ.add(a+" + "+b+" = "+c+" * "+d);
            if (a+b == c/d) equ.add(a+" + "+b+" = "+c+" / "+d);
            if (a-b == c+d) equ.add(a+" - "+b+" = "+c+" + "+d);
            if (a-b == c-d) equ.add(a+" - "+b+" = "+c+" - "+d);
            if (a-b == c*d) equ.add(a+" - "+b+" = "+c+" * "+d);
            if (a-b == c/d) equ.add(a+" - "+b+" = "+c+" / "+d);
            if (a*b == c+d) equ.add(a+" * "+b+" = "+c+" + "+d);
            if (a*b == c-d) equ.add(a+" * "+b+" = "+c+" - "+d);
            if (a*b == c*d) equ.add(a+" * "+b+" = "+c+" * "+d);
            if (a*b == c/d) equ.add(a+" * "+b+" = "+c+" / "+d);
            if (a/b == c+d) equ.add(a+" / "+b+" = "+c+" + "+d);
            if (a/b == c-d) equ.add(a+" / "+b+" = "+c+" - "+d);
            if (a/b == c*d) equ.add(a+" / "+b+" = "+c+" * "+d);
            if (a/b == c/d) equ.add(a+" / "+b+" = "+c+" / "+d);
        }
        else{
            if (a+b == c+d) equ.add(a+" + "+b+" = "+c+" + "+d);
            if (a+b == c-d) equ.add(a+" + "+b+" = "+c+" - "+d);
            if (a+b == c*d) equ.add(a+" + "+b+" = "+c+" * "+d);
            
            if (a-b == c+d) equ.add(a+" - "+b+" = "+c+" + "+d);
            if (a-b == c-d) equ.add(a+" - "+b+" = "+c+" - "+d);
            if (a-b == c*d) equ.add(a+" - "+b+" = "+c+" * "+d);
            
            if (a*b == c+d) equ.add(a+" * "+b+" = "+c+" + "+d);
            if (a*b == c-d) equ.add(a+" * "+b+" = "+c+" - "+d);
            if (a*b == c*d) equ.add(a+" * "+b+" = "+c+" * "+d);
        }
        Collections.sort(equ);
        
        if (equ.isEmpty()){
            System.out.println("problems ahead");
        }
        else{
            equ.forEach((s) -> {
                System.out.println(s);
            });
        }
        
    }
}
