import java.util.Arrays;


class Solution {
    public int[][] solution(int[][] arr) {
        
        int row = arr.length; //행의 개수 
        int col = arr[0].length; //열의 개수 
        
        int len = Math.max(row,col);
        
        int newarr[][] = new int[len][len];
    
        for(int i=0; i<newarr.length; i++)
        {
            Arrays.fill(newarr[i],0);
        }
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                newarr[i][j] = arr[i][j];
            }
        }
        
        return newarr;
    }
}