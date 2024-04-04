import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int N;
    static int map[][];
    static boolean visited[][];
    //dfs를 상하좌우로 돌기 위해서 그 상하좌우의 좌표값을 담아 줌 
    static int dirY[] = {-1,1,0,0};
    static int dirX[] = {0,0,-1,1};
    static int count; //단지 집의 숫자 
    
    static ArrayList<Integer> result; //단지 집의 수 저장
    
    //dfs
    public static int dfs(int x, int y)
    {
        visited[x][y] = true;
        
        //상하좌우 확인
        for(int i=0; i<4; i++)
        {
            int new_X = x + dirX[i];
            int new_Y = y + dirY[i];
            
            if(new_X>=0 && new_Y>=0 && new_X<N && new_Y<N)
            {
                if(map[new_X][new_Y]==1 && !visited[new_X][new_Y]){
                    dfs(new_X,new_Y);
                    count++;
                }
            }
        }
        
        return count;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        
        //맵 정보 반영
        for(int i=0; i<N; i++)
        {
        	String input = br.readLine();
            for(int j=0; j<N; j++)
            {
                map[i][j] = input.charAt(j)-'0';
            }
        }
        
        count = 0;
        
        result = new ArrayList<>();
        
        //dfs 수행
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N; j++)
            {
                if(map[i][j] == 1 && !visited[i][j])
                {
                    count=1; //맨 처음이기 때문에 count 1증가 
                    dfs(i,j);
                    result.add(count);
                }
            }
        }
        
        //출력
        Collections.sort(result);
        bw.write(String.valueOf(result.size()));
        bw.newLine();
        
        for(int i=0; i<result.size(); i++)
        {
            bw.write(String.valueOf(result.get(i)));
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}