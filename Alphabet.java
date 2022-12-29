/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author dakotasouth
 */
public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] beta = sc.nextLine().split("");
        String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < beta.length; i++) {
            if (beta[i].compareTo("a") == 0){
                int alphaIdx = 0;
                
                for (int j = i; j < beta.length; j++) {
                    System.out.println(beta[j] + " " + alpha[alphaIdx] + " " + alphaIdx);
                    if(beta[j].compareTo(alpha[alphaIdx]) != 0 || alphaIdx == alpha.length || j == beta.length-1){
                        if(len > alphaIdx){
                            len = alphaIdx;
                        }
                        break;
                    }
                    //System.out.println(alphaIdx);
                    alphaIdx++;
                }
            }
        }
        System.out.println(26 - len);
    }
}
