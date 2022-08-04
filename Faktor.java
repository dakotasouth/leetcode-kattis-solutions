package kattis;

import java.util.*;
import java.io.*;

public class Faktor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pubs = sc.nextInt();
        int factor = sc.nextInt();
        int minCites = pubs * (factor - 1);
        System.out.println(minCites + 1);
    }
}
