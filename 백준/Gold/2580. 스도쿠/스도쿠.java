import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  final static int SIZE = 9;
  static int[][] sudoku = new int[SIZE][SIZE];
  static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  
    
  public static boolean check(int row, int col, int value)
  {
      //같은 행에 있는 원소들 중 겹치는 열 원소가 있는지 검사 
      for(int i=0; i<9; i++)
      {
          if(sudoku[row][i] == value)
          {
              return false;
          }
      }
      
      //같은 열에 있는 원소들 중 겹치는 행 원소가 있는지 검사
      for(int i=0; i<9; i++)
      {
          if(sudoku[i][col] == value)
          {
              return false;
          }
      }
      
      //3*3칸에 중복되는 원소가 있는지 검사 
      int set_row = (row/3)*3; //value가 속한 3*3의 행의 첫 위치
      int set_col = (col/3)*3; //value가 속한 3*3의 열의 첫 위치
      
      for(int i=set_row; i<set_row+3; i++)
      {
          for(int j=set_col; j<set_col+3; j++)
          {
              if(sudoku[i][j] == value)
              {
                  return false;
              }
          }
      }
      
      return true; 
  }
  
  public static void dfs(int row, int col) throws IOException
  {
	  //해당 행이 다 채워졌을 경우 다음 행의 첫 번째 열부터 시작
	  if(col == SIZE)
	  {
		  dfs(row+1,0);
		  return;
	  }
	  
	  //행과 열이 모두 채워졌을 경우 출력 후 종료 
	  if(row == SIZE)
	  {
		  StringBuilder sb = new StringBuilder();
		  for(int i=0; i<SIZE;i++)
		  {
			  for(int j=0; j<SIZE; j++)
			  {
				  sb.append(sudoku[i][j]).append(' ');
			  }
			  sb.append('\n');
		  }
		  System.out.println(sb);
		  
		  System.exit(0);
	  }
	  
	  //만약 해당 위치의 값이 빈칸이라면 1부터 9까지 중 가능한 수 탐색
	  if(sudoku[row][col] ==0)
	  {
		  for(int i=1; i<=SIZE; i++)
		  {
			  //i값이 중복되지 않는지 검사 
			  if(check(row,col,i))
			  {
				  sudoku[row][col]=i;
				  dfs(row,col+1);
			  }
		  }
		  sudoku[row][col] = 0;
		  return;
	  }
	  dfs(row,col+1);
  }
    
  public static void main(String[] args) throws IOException
  {
	  
      for(int i=0; i<SIZE; i++)
      {
    	  StringTokenizer st = new StringTokenizer(br.readLine());
          for(int j=0; j<SIZE; j++)
          {
              sudoku[i][j] = Integer.parseInt(st.nextToken());
          }
      }
      
      dfs(0,0); //(0,0)부터 시작 
  }
}
  