
import java.io.*;
import java.util.*;
import java.math.BigDecimal;

public class CurveSpeed {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) System.out.println((int)Math.sqrt((sc.nextInt()*(sc.nextDouble()+.16))/.067));        
    }
}
