package kattis;

import java.util.*;

public class Filip {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        
        String[] line = sc.next().split("");
        String[] linee = sc.next().split("");
        
        for (int i = 0; i < line.length; i++) {
            one.add(Integer.parseInt(line[i]));
            two.add(Integer.parseInt(linee[i]));
        }
        boolean first = false;
        if (one.get(2) == two.get(2)){
            if (one.get(1) == two.get(1)){
                if(one.get(0) > two.get(0)){
                    first = true;
                }
                
            }
            else if(one.get(1) > two.get(1)){
                first = true;
            }
        } 
        else if(one.get(2) > two.get(2)){
            first = true;
        }
        if(first){
            for (int i = 2; i >= 0; i--) {
                System.out.print(one.get(i));
            }
        }
        else{
            for (int i = 2; i >= 0; i--) {
                System.out.print(two.get(i));
            }
        }
        System.out.println();
    }
}
