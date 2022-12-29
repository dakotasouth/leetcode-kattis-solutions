
import java.util.*;
import java.io.*;

public class ColourWars {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> colours = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int curr = sc.nextInt();
            if (colours.containsKey(curr)){
                colours.replace(curr, colours.get(curr) + 1);
            }
            else colours.put(curr, 1);
        }
        int sum = 0;
        for(Integer key: colours.keySet()){
            if(colours.get(key) <= key+1){
                sum+= key+1;
            }
            else{
                int groups = colours.get(key) / (key + 1);
                int rem = colours.get(key) % (key + 1);
                
                sum += groups * (key + 1);
                if(rem != 0) sum+= key+1;
            }
        }
        System.out.println(sum);
    }
}
