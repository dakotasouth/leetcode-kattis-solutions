import java.util.*;

public class terracehill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] hts = new int[n];

        for(int i=0;i<n;i++){
        hts[i] = sc.nextInt();
        }

        Stack<Integer> terr = new Stack<>();

        long totLen = 0;

        for(int i=0;i<n;i++){
            if(!terr.empty()){
                if(hts[i]<hts[terr.peek()]){
                    terr.push(i);
                }
                else{
                    while(!terr.empty() && hts[i] >= hts[terr.peek()]){
                        int top = terr.pop();
                        if(hts[i] == hts[top]){
                            totLen += i - top - 1;
                        }
                    }
                    terr.push(i);
                }
            }
            else{
                terr.push(i);
            }
        }
        System.out.println(totLen);
    }
}
