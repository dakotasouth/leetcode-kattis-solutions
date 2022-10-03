import java.util.*;

public class positivedivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        TreeSet<Long> divs = new TreeSet<>();

        for(long i=1; i<Math.sqrt(n)+1; i++){
            if(n % i == 0) {
                divs.add(i);
                divs.add(n / i);
            }
        }

        for(Long i: divs) System.out.println(i);
    }
}
