
import java.util.*;
import java.io.*;

public class VaccineEfficacy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        double aVaccInf = 0; double aContInf = 0;
        double bVaccInf = 0; double bContInf = 0;
        double cVaccInf = 0; double cContInf = 0;
       
        double vaccCount = 0;
        double contCount = 0;
       
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split("");
           
            if (line[0].compareTo("Y") == 0){
                vaccCount++;
                if(line[1].compareTo("Y") == 0) aVaccInf++;
                if(line[2].compareTo("Y") == 0) bVaccInf++;
                if(line[3].compareTo("Y") == 0) cVaccInf++;
            }
            else if (line[0].compareTo("N") == 0){
                contCount++;
                if(line[1].compareTo("Y") == 0) aContInf++;
                if(line[2].compareTo("Y") == 0) bContInf++;
                if(line[3].compareTo("Y") == 0) cContInf++;
            }
        }
        double aVaccE = aVaccInf / vaccCount;
        double bVaccE = bVaccInf / vaccCount;
        double cVaccE = cVaccInf / vaccCount;
       
        double aContE = aContInf / contCount;
        double bContE = bContInf / contCount;
        double cContE = cContInf / contCount;
        //System.out.println(bContE + " " + bVaccE + " " + bVaccInf + " " + vaccCount + " " + contCount);
       
        if(aVaccE < aContE) System.out.println(((aContE - aVaccE) / aContE) * 100);
        else System.out.println("Not Effective");
        if(bVaccE < bContE) System.out.println(((bContE - bVaccE) / bContE) * 100);
        else System.out.println("Not Effective");
        if(cVaccE < cContE) System.out.println(((cContE - cVaccE) / cContE) * 100);
        else System.out.println("Not Effective");
    }
}
