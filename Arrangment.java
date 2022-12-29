
import java.util.*;
import java.io.*;

public class Arrangment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rooms = sc.nextInt();
        int teams = sc.nextInt();
        
        int rem = teams % rooms;
        int perRoom = teams / rooms;
        
        
        for (int i = 0; i < rooms; i++) {
            for (int j = 0; j < perRoom; j++) {
                System.out.print("*");
            }
            if (rem > 0) {
                System.out.print("*");
                rem --;
            }
            System.out.println();
        }
    }
}
