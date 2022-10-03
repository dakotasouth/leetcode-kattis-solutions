import java.util.*;

public class eveningout2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        //holds all multiples of a
        ArrayList<Long> multiples = new ArrayList<>();

        for(long i=1;i<Math.sqrt(a)+1;i++){
            if (a%i == 0){
                multiples.add(i);
                multiples.add(a / i);
            }
        }

        //closest multiple
        long closest = Long.MAX_VALUE;

        //finds closest multiple
        for(Long num: multiples){
            if(Math.abs(b-num) < closest) {
                closest = Math.abs(b-num); 
                //System.out.println(num);
            }
        }

        System.out.println(closest);
    }
}
