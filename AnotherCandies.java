
import java.util.*;
import java.io.*;

public class AnotherCandies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int y = sc.nextInt();
        int s = sc.nextInt();
        //boolean raven = false;
        ArrayList<Integer> trees = new ArrayList<>();
        trees.add(r); trees.add(g); trees.add(b); trees.add(y);
        Collections.sort(trees);
        
        double winCount = 0;
        for (int i = 0; i < 100000; i++) {
            int rr = r; int gg = g; int bb = b; int yy = y; int ss = s;
            while(rr+bb+gg+yy > 0 && ss > 0){
                double num = 1 + (int)(Math.random() *((6-1) + 1));
                //System.out.println(num);
                if (num == 5){
                    double tree = trees.get(3);
                    if(tree > 0){
                        tree--;
                        Collections.sort(trees);
                    }
                }
                if (num == 1 && rr > 0) rr--;
                if (num == 2 && gg > 0) gg--;
                if (num == 3 && bb > 0) bb--;
                if (num == 4 && yy > 0) yy--;
                if (num == 6 && ss > 0) ss--;
            }
            if (rr+gg+bb+yy == 0) winCount++;
            
        }
        System.out.println(winCount);
        System.out.println(winCount / 100000.0);
    }
}
