package kattis;

import java.util.*;

public class ClassyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int people = sc.nextInt();
        
        for (int i = 0; i < cases; i++) {
            ArrayList<String> names = new ArrayList<>();
            for (int j = 0; j < people; j++) {
                String[] line = sc.nextLine().split("-");
                String[] last = line[line.length - 1].split(" ");
                line[line.length - 1] = last[0];
                
                for (String line1 : line) {
                    System.out.print(line1 + " ");
                }System.out.println();
                
                
                
            }
        }
    }
}
