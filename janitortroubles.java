import java.util.*;
public class janitortroubles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sides = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double semi = Arrays.stream(sides).sum() / 2.0;
        System.out.println(Math.sqrt((semi - sides[0]) *
                                     (semi - sides[1]) *
                                     (semi - sides[2]) *
                                     (semi - sides[3])));
    }
}
