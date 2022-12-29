
import java.util.*;
import java.io.*;

public class Cetvrta {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> xverts = new HashMap<>();
        Map<Integer, Integer> yverts = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(xverts.containsKey(x)) xverts.put(x, 2);
            else xverts.put(x,1);
            if(yverts.containsKey(y)) yverts.put(y, 2);
            else yverts.put(y,1);
        }
        for(Integer key: xverts.keySet()){
            if(xverts.get(key) == 1) System.out.print(key+" ");
        }
        for(Integer key: yverts.keySet()){
            if(yverts.get(key) == 1) System.out.println(key);
        }
        
        
    }
}
