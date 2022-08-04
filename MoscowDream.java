
package kattis;
import java.util.*;
public class MoscowDream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        
        if (a>=1 && b>=1 && c>=1 && a+b+c >= n && n >=3) System.out.println("YES");
        else System.out.println("NO");
    }
}
