
import java.util.*;
import java.io.*;

public class ABC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> abc = new ArrayList<>();
        abc.add(sc.nextInt());
        abc.add(sc.nextInt());
        abc.add(sc.nextInt());
        Collections.sort(abc);
        String[] order = sc.next().split("");
        
        for (int i = 0; i < 3; i++) {
            if (order[i].compareTo("A") == 0) System.out.print(abc.get(0)+" ");
            else if(order[i].compareTo("B") == 0) System.out.print(abc.get(1)+" ");
            else if(order[i].compareTo("C") == 0) System.out.print(abc.get(2)+" ");
        }
        System.out.println();
    }
}
