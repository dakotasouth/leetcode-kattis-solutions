import java.util.*;
public class magictrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int ans = (line.chars().distinct().count() == line.length()) ? 1 : 0;
        System.out.println(ans);
    }
}
