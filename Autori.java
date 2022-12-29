
import java.util.*;
import java.io.*;

public class Autori {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String capitals = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String[] line = sc.next().split("");
        for (int i = 0; i < line.length; i++) {
            if(capitals.contains(line[i])) System.out.print(line[i]);
        }
        System.out.println();
    }
}
