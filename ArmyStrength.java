
import java.util.*;
import java.io.*;

public class ArmyStrength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int gsize = sc.nextInt();
            int msize = sc.nextInt();
            ArrayList<Integer> gArmy = new ArrayList<>();
            ArrayList<Integer> mArmy = new ArrayList<>();
            for (int j = 0; j < gsize; j++) {
                gArmy.add(sc.nextInt());
            }
            for (int j = 0; j < msize; j++) {
                mArmy.add(sc.nextInt());
            }
            Collections.sort(mArmy);
            Collections.sort(gArmy);
            
            while(!mArmy.isEmpty() && !gArmy.isEmpty()){
                if (mArmy.get(0) > gArmy.get(0)) gArmy.remove(0);
                else if(gArmy.get(0) > mArmy.get(0)) mArmy.remove(0);
                else mArmy.remove(0);
            }
            if (mArmy.isEmpty()) System.out.println("Godzilla");
            else if(gArmy.isEmpty()) System.out.println("MechaGodzilla");
            else System.out.println("uncertain");
        }
    }
}
