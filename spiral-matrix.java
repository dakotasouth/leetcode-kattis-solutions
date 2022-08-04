import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        //offset
        int x = -1;
        int y = 0;

        int xmax = matrix[0].length;
        int ymax = matrix.length - 1;

        int xct = 0;
        int yct = 0;

        while (spiral.size() < matrix.length * matrix[0].length){
            //moving right
            while(xct < xmax){   
                x++;
                spiral.add(matrix[y][x]);                             
                xct++;                
            }
            if (spiral.size() == matrix.length * matrix[0].length) break;
            xct = 0;
            xmax --;
            //moving down
            while(yct < ymax){
                y++;
                spiral.add(matrix[y][x]);
                yct++;
            }
            if (spiral.size() == matrix.length * matrix[0].length) break;
            yct = 0;
            ymax--;
            //moving left
            while(xct < xmax){
                x--;
                spiral.add(matrix[y][x]);
                xct++;
            }
            if (spiral.size() == matrix.length * matrix[0].length) break;
            xct = 0;
            xmax--;
            //moving up
            while(yct < ymax){
                y--;
                spiral.add(matrix[y][x]);
                yct++;
            }
            if (spiral.size() == matrix.length * matrix[0].length) break;
            yct = 0;
            ymax--;
        }

        return spiral;
    }
}