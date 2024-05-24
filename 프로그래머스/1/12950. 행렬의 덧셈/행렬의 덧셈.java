class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int row_size = arr1.length;
        int col_size = arr1[0].length;
        
        int[][] answer = new int[row_size][col_size];
        
        for(int i=0; i<row_size; i++)
        {
            for(int j=0; j<col_size; j++)
            {
                answer[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        
        return answer;
    }
}