
import java.io.*;
import java.util.*;

public class Babelfish {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);
        
        Map<String, String> dict = new HashMap<>();
        String[] line = br.readLine().split(" ");
        while(line.length > 1){
            dict.put(line[1], line[0]);
            line = br.readLine().split(" ");
        }
        String key = br.readLine();
        while(!key.isEmpty()){
            if(dict.containsKey(key)) {
                System.out.println(dict.get(key));
            }
            else System.out.println("eh");
            
            key = br.readLine();
        }
        br.close();
        sr.close();
    }
}
