import java.util.*;

public class highesthill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] hts = new long[n];

        for(int i=0;i<n;i++){
            hts[i] = sc.nextLong();
        }
        long maxH=0;
        long hi = -1;
        long hj = hts[0];
        long hk = hts[1];
        for(int i=1;i<n-1;i++){
            if(hts[i+1] >= hk){
                //check peak heights
                if(hj-hi < hj-hk && hj-hi > maxH){
                    maxH = hj-hi;
                }
                else if(hj-hi > hj-hk && hj-hk > maxH){
                    maxH = hj-hk;
                }
                hi=hts[i];
                hk = Long.MAX_VALUE;
                hj = Long.MAX_VALUE;
            }
            
        }
        System.out.println(maxH);
    }
}
