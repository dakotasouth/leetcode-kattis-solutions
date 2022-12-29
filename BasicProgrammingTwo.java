
import java.util.*;
import java.io.*;

public class BasicProgrammingTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        if (t == 1){
            boolean done = false;
            for (int i = 0; i < n; i++) {
                if(done) break;
                for (int j = 0; j < n; j++) {
                    if (list[i] != list[j] && list[i] + list[j] == 7777) {
                        System.out.println("YES");
                        done = true;
                        break;
                    }
                }
            }
            if(!done) System.out.println("NO");
        }
        if (t == 2){
            boolean same = false;
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(list[i]);
            }
            if (set.size() == n) System.out.println("Unique");
            else System.out.println("Contains duplicate");
        }
        if (t == 3){
            int[] newlist = list;
            Arrays.sort(newlist);
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (found) break;
                for (int j = 1; j < n; j++) {
                    if(newlist[i] != newlist[j]){
                        if(j-i+1 > n/2) {
                            System.out.println(newlist[i]);
                            found = true;
                            break;
                        }
                        else {
                            i = j;
                        }
                    }
                }
            }
            if(!found) System.out.println("-1");
        }
        if (t == 4){
            int[] newlist = list;
            Arrays.sort(newlist);
            if (n % 2 == 0){
                System.out.println(newlist[(n/2) - 1] + " " + newlist[(n/2)]);
            }
            else System.out.println(newlist[(n/2) - 1]);
        }
        else{
            int[] newlist = list;
            Arrays.sort(newlist);
            
            for (int i = 0; i < n; i++) {
                if (newlist[i] >= 100 && newlist[i] <= 999){
                    System.out.print(newlist[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
