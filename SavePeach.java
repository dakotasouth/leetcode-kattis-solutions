package kattis;

import java.util.*;
        
public class SavePeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int obstacles = sc.nextInt();
        int obsFound = sc.nextInt();
        ArrayList<Integer> obst = new ArrayList<>();
        
        for (int i = 0; i < obsFound; i++) {
            int k = sc.nextInt();
            obst.add(k);
        }
        for (int j = 0; j < obstacles; j++) {
            if (!obst.contains(j)) System.out.println(j);
        }
        System.out.println("Mario got " + obsFound + " of the dangerous obstacles.");
        
    }
    
    
}
