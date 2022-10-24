import java.util.*;

public class highesthill {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long[] range = new long[n];

        for(int i=0;i<n;i++){
            range[i] = sc.nextLong();
        }
        long maxP = 0;
        int lv = 0;
        int rv = 0;
        for(int i=1;i<n-1;i++){
            if(i <= rv) continue;
            lv = rv;    
            int r = i+1;
            
            while(r < n && range[r] <= range[r-1]){
                rv = r;
                r++;
            }
            
            if(lv != rv && Long.min(range[i]-range[lv], range[i]-range[rv]) > maxP) {
                maxP = Long.min(range[i]-range[lv], range[i]-range[rv]);
                System.out.println(i+" "+maxP);
            }
            
        }
        System.out.println(maxP);
    }
}
