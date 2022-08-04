package kattis;

import java.util.*;
import java.io.*;

public class TakeTwoStones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt() % 2 == 0 ? "Bob" : "Alice");
    }
}
