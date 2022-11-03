import java.util.*;
public class pokechat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] letters = sc.nextLine().split("");
        int[] line = Arrays.stream(sc.nextLine().split("(?<=\\G.{" + 3 + "})")).mapToInt(Integer::parseInt).toArray();
        Arrays.stream(line).forEach(s -> System.out.print(letters[s-1]));
    }
}
