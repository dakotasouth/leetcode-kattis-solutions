import java.util.*;
public class successfulzoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean abort = true;
        for(int i=1;i<n/2+1;i++){
            //System.out.println(i);
            boolean inc = true;
            int last = nums[i-1];
            for(int j=i*2;j<=n;j+=i){
                //System.out.println(nums[i-1] + " " + nums[j-1]);
                if(nums[j-1] <= last){
                    inc = false;
                    break;
                }
                else last = nums[j-1];
            }
            if(inc){
                System.out.println(i);
                abort = false;
                break;
            }
        }
        if(abort) System.out.println("ABORT!");
    }
}