
import java.util.*;
import java.io.*;

public class CostumeContest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> cats = new HashMap<>();
        int minCount = 1;
        for (int i = 0; i < n; i++) {
            String cat = sc.next();
            Integer count = cats.get(cat);
            //System.out.println(count);            
            cats.put(cat, (count == null) ? 1: count + 1);
        }
        Integer[] counts = cats.values().toArray(new Integer[0]);
        int min = Integer.MAX_VALUE;
        for(Integer i: counts) if (i < min) min = i;
        
        ArrayList<String> top = new ArrayList<>();
        for (Map.Entry name: cats.entrySet()) {
            if (name.getValue().equals(min)) top.add(String.valueOf(name.getKey()));
        }
        Collections.sort(top);
        for(String s: top) System.out.println(s);
    }
}
