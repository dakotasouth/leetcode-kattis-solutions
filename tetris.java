import java.util.*;

public class tetris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cols = sc.nextInt();
        int piece = sc.nextInt();

        //add all heights to list
        int[] heights = new int[cols];
        for(int i=0; i<cols; i++){
            heights[i] = sc.nextInt();
        }

        int drops = 0;

        //first piece fits anywhere and 4 even cols
        if (piece == 1){
            for(int i=0; i<cols; i++){
                drops++; 
            }
            if(cols > 3){
                for(int i=0;i<cols-3;i++){
                    if(heights[i] == heights[i+1] && heights[i+1] == heights[i+2] && heights[i+2] == heights[i+3]) drops++;
                }
            }
        }
        //second piece is only on two even cols
        else if(piece == 2 && cols > 1){
            for(int i=0;i<cols-2;i++){
                if(heights[i] == heights[i+1]) drops++;
            }            
        }
        else if(piece == 3 && cols > 1){
            for(int i=0;i<cols-2;i++){
               if(heights[i] == heights[i+1] && heights[i+1] - heights[i+2] == -1) drops++;
               //rotated 90 and 270 degrees
               if(heights[i+1] - heights[i+2] == 1) drops++;
            }
            //check last two cols
            if (heights[cols-2] - heights[cols-1] == 1) drops++;
            
        }
        //fourth similar to third
        else if(piece == 4 && cols > 1){
            for(int i=0;i<cols-2;i++){
                if(heights[i] - heights[i+1]  == 1 && heights[i+1] == heights[i+2]) drops++;
                //rotated 90 and 270 degrees
                if(heights[i+1] - heights[i+2] == -1) drops++; 
            }
            //check last two cols
            if (heights[cols-2] - heights[cols-1] == -1) drops++;
            
        }
        //fifth same as last but also height diff of 1 on each side
        else if(piece == 5 && cols > 1){
            for(int i=0;i<cols-2;i++){
                if(heights[i] == heights[i+1] && heights[i+1] == heights[i+2]) drops++;
                //rotated 180
                if(heights[i] - heights[i+1] == 1 && heights[i+1] - heights[i+2] == -1) drops++;
                //rotated 90
                if(heights[i] - heights[i+1] == -1) drops++;
                //rotated 270
                if(heights[i] - heights[i+1] == 1) drops++;  
            }

            //check last two cols
            if(heights[cols-2] - heights[cols-1] == -1 || heights[cols-2] - heights[cols-1] == 1) drops++;

        }
        //sixth is 3 even cols, 2 even cols, diff of 2, and 2 evens with a diff of 1
        else if(piece == 6 && cols > 1){
            for(int i=0;i<cols-2;i++){
                if(heights[i] == heights[i+1] && heights[i+1] == heights[i+2]) drops++;
                //rotated 90 degrees
                if(heights[i] == heights[i+1]) drops++;
                //rotated 180 degrees
                if(heights[i] - heights[i+1] == -1 && heights[i+1] == heights[i+2]) drops++;
                //rotated 270 degrees
                if(heights[i] - heights[i+1] == 2) drops++;
            }

            //check last two cols
            if(heights[cols-2] - heights[cols-1] == 2 || heights[cols-2] == heights[cols-1]) drops++;
        }
        //seventh is just six reversed
        else if(piece == 7 && cols > 1){ 
            for(int i=0;i<cols-2;i++){
                if(heights[i] == heights[i+1] && heights[i+1] == heights[i+2]) {
                    drops++;
                    //System.out.println("0");
                }
                //rotated 270 degrees
                if(heights[i] == heights[i+1]) {
                    drops++;
                    //System.out.println("270");
                }
                //rotated 180 degrees
                if(heights[i] == heights[i+1] && heights[i+1] - heights[i+2] == 1) {
                    drops++;
                    //System.out.println("180");
                }
                //rotated 90 degrees
                if(heights[i] - heights[i+1] == -2) {
                    drops++;
                    //System.out.println("90");
                }
            }

            //check last two cols
            if(heights[cols-2] - heights[cols-1] == -2 || heights[cols-2] == heights[cols-1]) drops++;
        }
        System.out.println(drops);
    }
}
