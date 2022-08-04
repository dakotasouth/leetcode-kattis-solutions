package kattis;

import java.util.*;

public class AddingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Map<String, Integer> variables = new HashMap<>();
        
        while(true){
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            else{
                String[] lineArr = line.split(" ");
                if (lineArr[0].compareTo("def") == 0) {
                    variables.put(lineArr[1],Integer.valueOf(lineArr[2]));
                }
                else if(lineArr[0].compareTo("calc") == 0){
                    int sum = 0;
                    if (variables.containsKey(lineArr[1])) sum += variables.get(lineArr[1]);
                    else {
                        for (int j = 1; j < lineArr.length; j++) {
                                    System.out.print(lineArr[j]+" ");
                                }
                                System.out.println("unknown");
                    }
                    for (int i = 2; i < lineArr.length; i++) {
                        if (lineArr[i].compareTo("+") == 0){
                            if(variables.containsKey(lineArr[i+1])){
                                sum += variables.get(lineArr[i+1]);                   
                            }else{
                                for (int j = 1; j < lineArr.length; j++) {
                                    System.out.print(lineArr[j]+" ");
                                }
                                System.out.println("unknown");
                            }
                        }
                        else if(lineArr[i].compareTo("-") == 0){
                            if(variables.containsKey(lineArr[i-1]) && variables.containsKey(lineArr[i+1])){
                                sum -= variables.get(lineArr[i+1]);                                
                            }else{
                                for (int j = 1; j < lineArr.length; j++) {
                                    System.out.print(lineArr[j]+" ");
                                }
                                System.out.println("unknown");
                            }
                        }
                    }
                    String result = "";
                    if (variables.containsValue(sum)) result = variables.
                    else result = String.valueOf(sum);
                    for (int i = 1; i < lineArr.length; i++) {
                        System.out.print(lineArr[i]+ " ");
                    }
                    System.out.println(sum);
                }
                else if(lineArr[0].compareTo("clear") == 0) variables.clear();
            }          
        }
    }
    
}
