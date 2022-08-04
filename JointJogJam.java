package kattis;

import java.util.*;
import java.io.*;

public class JointJogJam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int xstartK = sc.nextInt();
        int ystartK = sc.nextInt();
        int xstartO = sc.nextInt();
        int ystartO = sc.nextInt();
        int xendK = sc.nextInt();
        int yendK = sc.nextInt();
        int xendO = sc.nextInt();
        int yendO = sc.nextInt();
        
        System.out.println(Math.max(Math.sqrt(Math.pow(xstartO - xstartK, 2) + Math.pow(ystartO - ystartK, 2)), Math.sqrt(Math.pow(xendO - xendK, 2) + Math.pow(yendO - yendK, 2))));
    }
}
