package kattis;

import java.util.*;

public class SortOfSorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0){
            //System.out.println(n);
            ArrayList<String> names = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                names.add(sc.next());
            }
            //System.out.println(names.size());
            Collections.sort(names, (n1, n2) -> n1.substring(0,2).compareTo(n2.substring(0,2)));
            
            for (String name : names) {
                System.out.println(name);
            }
            System.out.println();
            sc.nextLine();
            n = sc.nextInt();
            
            
        }
    }

    
}
