class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        //지뢰 
        int dir[][]= {{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{1,-1},{-1,1},{1,1}};
        
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[i].length; j++)
            {
                if(board[i][j]==1)
                {
                    find(i,j,dir,board);
                }
            }
        }
        
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                if(board[i][j]==0)
                    answer++;
            }
        }
        return answer;
    }
    
    public  void find(int row, int col, int dir[][], int board[][])
    {
        for(int i=0; i<dir.length; i++) {
			//범위 안벗어나게
			if(row+dir[i][0]>=0 && row+dir[i][0]<board.length 
					&& col+dir[i][1]>=0 && col+dir[i][1]<board.length) {
				
				if(board[row+dir[i][0]][col+dir[i][1]]==0) {
                
                //지뢰 주변인 애들
					board[row+dir[i][0]][col+dir[i][1]]=3;
				}
			}
        
        }
    }
}