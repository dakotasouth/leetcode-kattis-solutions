package kattis;

import java.util.*;
import java.io.*;

public class IsItHalloween {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        
        if (date.compareTo("OCT 31") == 0 || date.compareTo("DEC 25") == 0) System.out.println("yup");
        else System.out.println("nope");
    }
}
