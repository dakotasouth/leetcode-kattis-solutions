import java.util.*;
public class nsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); sc.nextInt(); sc.nextLine();
        System.out.println(Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).sum());
    }
}
