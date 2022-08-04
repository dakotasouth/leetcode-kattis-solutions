package kattis;

import java.util.*;

public class PerioidicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] letters = sc.nextLine().split("");
        int period = letters.length;
        ArrayList<Integer> mults = new ArrayList<>();
        
        for (int i = 1; i < Math.sqrt(period) + 1; i++) {
            if (letters.length % i == 0) mults.add(i);
        }
        mults.add(letters.length);
        Collections.sort(mults);
        Collections.reverse(mults);
        //mults.forEach(n -> System.out.println(n));
        
        if (letters.length > 1){
            for(Integer i: mults){
                boolean per = true;
                for (int j = i-1; j < letters.length - i; j += i) {
                    if(j != letters.length - 1){
                        if (letters[j].compareTo(letters[j+1]) != 0){
                            per = false;
                            break;
                        }
                    }
                }
                if(per) period = i;
            }
        }
        System.out.println(period);
    }
}
