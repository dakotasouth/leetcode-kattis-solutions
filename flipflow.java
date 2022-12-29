import java.util.*;

public class flipflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int s = sc.nextInt();
        int n = sc.nextInt();

        int[] flips = new int[n];

        for(int i=0;i<n;i++){
            flips[i]= sc.nextInt();
        }

        int sandTop = s;
        for(int i=0;i<n-1;i++){
            //new amount in top is bottom amount plus how much falls
            sandTop = (s-sandTop) + (flips[i+1]-flips[i]);
            //if all falls from top the top then just set == s
            if (sandTop > s) sandTop = s;
        }
        //calc how much falls after last flip
        sandTop -= (t-flips[n-1]);
    
        if(sandTop < 0) sandTop = 0;
        
        System.out.println(sandTop);
    }   
}
