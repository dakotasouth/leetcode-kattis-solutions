class Solution {
    public int[] findBall(int[][] grid) {
        int[] ballPos = new int[grid[0].length];

        // init ball positions
        for(int i=0; i<ballPos.length; i++){
            ballPos[i] = i;
        }

        for(int row=0; row < grid.length; row++){
            for(int ball=0; ball < ballPos.length; ball++){
                int pos = ballPos[ball];
                if(pos != -1 && pos != -2){
                    if(grid[row][pos] == 1){
                        if(pos == grid[0].length-1){
                            ballPos[ball] = -2;
                        }
                        else if(grid[row][pos+1] == -1){
                            ballPos[ball] = -1;
                        }
                        else{
                            ballPos[ball] = pos++;
                        }
                    }
                    else if(grid[row][pos] == -1){
                        if(pos == 0){
                            ballPos[ball] = -2;
                        }
                        else if(grid[row][pos-1] == 1){
                            ballPos[ball] = -1;
                        }
                        else{
                            ballPos[ball] = pos--;
                        }
                    }
                }
            }
        }

        return ballPos;
    }
    public static void main(String[] args) {
    
        //print(findball(grid));
    }
}