import java.util.*;
public class zanzibar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            int sum = 0;
            int last = sc.nextInt();
            int curr = sc.nextInt();
            while(curr != 0){
                if(curr > last*2){
                    sum += curr - (last*2);
                }
                last = curr;
                curr = sc.nextInt();
            }
            System.out.println(sum);
        }
        
    }
}
