package kattis;

import java.util.*;
import java.io.*;

public class FlowLayout {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maxWid = sc.nextInt();        
        while(maxWid != 0){// new case
            int currWidth = sc.nextInt();
            int currHeight = sc.nextInt();
            int totalWidth = 0;
            int lineWidth = 0;
            int totalHeight = 0;
            int prevHeight = 0;
            while(currWidth > 0 && currHeight > 0){// new box
                if (lineWidth + currWidth <= maxWid){
                    lineWidth += currWidth;
                    if (lineWidth > totalWidth) totalWidth = lineWidth;
                    
                    if (prevHeight + currHeight > totalHeight){
                        totalHeight = prevHeight + currHeight;
                    }
                }else{
                    lineWidth = currWidth;                    
                    prevHeight = totalHeight;
                    totalHeight = prevHeight + currHeight;
                    
                }
                currWidth = sc.nextInt();
                currHeight = sc.nextInt();
                
            }
            System.out.println(totalWidth+" x "+totalHeight);
            maxWid = sc.nextInt();            
        }
    }
}
