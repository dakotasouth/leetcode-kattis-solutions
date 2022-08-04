package kattis;

import java.io.*;
import java.util.*;

public class NewAlphabet {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Map<String,String> alpha = new HashMap<>();
        alpha.put("a", "@"); alpha.put("b", "8"); alpha.put("c", "(");
        alpha.put("d", "|)"); alpha.put("e", "3"); alpha.put("f", "#");
        alpha.put("g", "6"); alpha.put("h", "[-]"); alpha.put("i", "|");
        alpha.put("j", "_|"); alpha.put("k", "|<"); alpha.put("l", "1"); 
        alpha.put("m", "[]\\/[]"); alpha.put("n", "[]\\[]"); alpha.put("o", "0");
        alpha.put("p", "|D"); alpha.put("q", "(,)"); alpha.put("r", "|Z");
        alpha.put("s", "$"); alpha.put("t", "']['"); alpha.put("u", "|_|");
        alpha.put("v", "\\/"); alpha.put("w", "\\/\\/"); alpha.put("x", "}{");
        alpha.put("y", "`/"); alpha.put("z", "2");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] chars = br.readLine().split("");
        
        for(String i: chars){
            if (alpha.containsKey(i.toLowerCase())) System.out.print(alpha.get(i.toLowerCase()));
            else System.out.print(i);
        }System.out.println();
    }
}
