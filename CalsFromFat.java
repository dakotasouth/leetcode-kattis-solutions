package kattis;

import java.util.*;
import java.io.*;
import java.math.*;
import java.text.DecimalFormat;

public class CalsFromFat {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String line = sc.nextLine();
        int count = 0;
        double totalCals = 0;
        double fatCals = 0;
        while(sc.hasNextLine() /*|| line.compareTo("1") !=0*/){
            if(count < 2){
                if(line.compareTo("-") != 0){
                    count = 0;
                    double currCals = 0;

                    String[] facts = line.split(" ");
                    //checking for Calorie values first
                    for (int i = 0; i < facts.length; i++) {                    
                        if(facts[i].substring(facts[i].length()-1).compareTo("C") == 0){
                            currCals += Double.parseDouble(facts[i].substring(0, facts[i].length()-1));
                            //System.out.println(Double.parseDouble(facts[i].substring(0, facts[i].length()-1)));
                        }
                    }
                    //checking for Gram values second
                    for (int i = 0; i < facts.length; i++) {
                        if(facts[i].substring(facts[i].length()-1).compareTo("g") == 0){
                            //computing gram to calorie value
                            if(i==0){
                                currCals+= 9 * Double.parseDouble(facts[i].substring(0, facts[i].length()-1));
                                //System.out.println(9 * Double.parseDouble(facts[i].substring(0, facts[i].length()-1)));
                            }
                            else if(i==1 || i==2 || i==3){
                                currCals+= 4 * Double.parseDouble(facts[i].substring(0, facts[i].length()-1));
                                //System.out.println(4 * Double.parseDouble(facts[i].substring(0, facts[i].length()-1)));
                            }
                            else if(i==4){
                                currCals+= 7 * Double.parseDouble(facts[i].substring(0, facts[i].length()-1));
                                //System.out.println(7 * Double.parseDouble(facts[i].substring(0, facts[i].length()-1)));
                            }
                            
                        }
                    }
                    //finding percent values last
                    double per = 0;
                    for (int i = 0; i < facts.length; i++) {
                        if(facts[i].substring(facts[i].length()-1).compareTo("%") == 0){
                            DecimalFormat df = new DecimalFormat("#.##");
                            double currPer = Double.parseDouble(facts[i].substring(0, facts[i].length()-1)) / 100;
                            currPer = Double.valueOf(df.format(currPer));
                            per+= currPer;
                            //System.out.println(i+" adding to per "+ currPer);
                        }
                    }
                    per = 1 - per;
                    DecimalFormat df = new DecimalFormat("#.##");
                    per = Double.valueOf(df.format(per));
                    //System.out.println(currCals);
                    //System.out.println("per "+per);
                    currCals = currCals/per;
                    //System.out.println("currCals "+ currCals);
                    per = 0;
                    totalCals += currCals;
                    //System.out.println("totalCals "+totalCals);
                    //finding amount fat calories
                    String fat = facts[0];
                    if(fat.substring(fat.length()-1).compareTo("C") == 0) {
                        fatCals += Double.parseDouble(fat.substring(0, fat.length()-1));
                        //System.out.println("adding to fatcals "+Double.parseDouble(fat.substring(0, fat.length()-1)));
                    }
                    else if(fat.substring(fat.length()-1).compareTo("g") == 0) {
                        fatCals += 9 * Double.parseDouble(fat.substring(0, fat.length()-1));
                        //System.out.println("adding to fatcals "+9 * Double.parseDouble(fat.substring(0, fat.length()-1)));
                        
                    }
                    else if(fat.substring(fat.length()-1).compareTo("%") == 0) {
                        fatCals += (Double.parseDouble(fat.substring(0, fat.length()-1)) / 100) * currCals;
                        //System.out.println("adding to fatcals "+(Double.parseDouble(fat.substring(0, fat.length()-1)) / 100) * currCals);
                    }
                    line = sc.nextLine();
                }
                else{
                    count++;
                    if (count < 2){
                        DecimalFormat df = new DecimalFormat("#");
                        double fatPer = Double.valueOf(df.format((fatCals / totalCals) * 100));
                        System.out.println((int)fatPer + "%");                                            
                    }
                    totalCals = 0;
                    fatCals = 0;
                    line = sc.nextLine();                        
                }
            }else break;
        }
    }
}
