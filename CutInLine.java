
import java.util.*;
import java.io.*;

public class CutInLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<String> line = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            line.add(sc.nextLine());
            System.out.println(line.peekLast());
        }
        sc.nextLine();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String[] event = sc.nextLine().split(" ");
            if (event[0].compareTo("cut") == 0){
                if(line.contains(event[2])){
                    line.remove(event[2]);
                    line.add(line.indexOf(event[2]), event[1]);
                }
                else line.add(line.indexOf(event[2]), event[1]);
            }
            else if(event[0].compareTo("leave") == 0){
                line.remove(event[1]);
            }
        }
        for (int i = 0; i < line.size(); i++) {
            System.out.println(line.get(i));
        }
    }
}
