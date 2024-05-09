class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        
        int length = board[1]/2; //세로 길이 y 최대값
        int width = board[0]/2; //가로 길이 x 최대값
        
        for(int i=0; i<keyinput.length; i++)
        {
            String cur = keyinput[i];
            
            if(cur.equals("up"))
            {
                if(answer[1]!=length)
                {
                    answer[1] = answer[1]+1;
                }
                else
                {
                    answer[1] = length;
                }
            }
            else if(cur.equals("down"))
            {
                if(answer[1] != (-length))
                {
                    answer[1] = answer[1]-1;
                }
                else
                {
                    answer[1] = (-length);
                }
            }
            else if(cur.equals("right"))
            {
                if(answer[0]!=width)
                {
                    answer[0] = answer[0]+1;
                }
                else
                {
                    answer[0] = width;
                }
                
            }
            else if(cur.equals("left"))
            {
                if(answer[0]!=(-width))
                {
                    answer[0] = answer[0]-1;
                }
                else
                {
                    answer[0] = (-width);
                }
                
            }
            
        }
        return answer;
    }
}