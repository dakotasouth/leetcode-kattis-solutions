import java.util.*;
public class outofsorts {
    public static boolean binsearch(long[] arr, long x , int low, int high){
        if (low > high){
            return false;
        }
        else{
            int mid = (low + high) / 2;
            if(x == arr[mid]) return true;
            else if (x > arr[mid]) return binsearch(arr, x, mid+1, high);
            else return binsearch(arr, x, low, mid - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();
        long c = sc.nextInt();
        long x = sc.nextInt();

        long[] arr = new long[n];

        long curr = x;
        for (int i=0;i<n;i++){
            arr[i] = (a*curr + c) % m;
            curr = arr[i];
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
            if (binsearch(arr, arr[i], 0, arr.length - 1)) sum ++;
        }
        System.out.println(sum);
    }
}
