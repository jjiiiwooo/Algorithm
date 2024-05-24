import java.util.*;

class Solution {
    public static char grid[][];
    public static HashMap<String, int[]> dir;
    public static int[] answer;
    
    public static void move(String op, int step)
    {
        int x = answer[1];
        int y = answer[0];
        
        for(int i=0; i<step; i++)
        {
            int d[] = dir.get(op);
            x+=d[1];
            y+=d[0];
            
            if(x>=0 && y>=0 && x<grid[0].length&& y<grid.length)
            {
                if(grid[y][x] == 'X')
                {
                    return;
                }
            }
            else
            {
                return;
            }
        }
        
        answer[0] = y;
        answer[1] = x;
    }
    
    public int[] solution(String[] park, String[] routes) {
        answer = new int[2];
        int height = park.length;
        int width = park[0].length();
        
        //park 배열 2차원 배열로 변경하고 시작 위치 찾기 
        grid = new char[height][width];
        
        for(int i=0; i<height; i++)
        {
            for(int j=0; j<width; j++)
            {
                grid[i][j] = park[i].charAt(j);
                if(grid[i][j] == 'S')
                {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        //이동 방향 
        dir = new HashMap<>();
        dir.put("E", new int[]{0,1});
        dir.put("W", new int[]{0,-1});
        dir.put("S", new int[]{1,0});
        dir.put("N", new int[]{-1,0});
        
        for(String route : routes)
        {
            String op = route.split(" ")[0];
            int step = Integer.parseInt(route.split(" ")[1]);
            move(op,step);
        }
        
        return answer;
    }
}