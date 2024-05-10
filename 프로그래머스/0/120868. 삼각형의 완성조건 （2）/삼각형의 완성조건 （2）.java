import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        //a>b
        int a = sides[1];
        int b = sides[0];
        
        if(a==2 && b==1)
        {
            answer =1;
        }
        else
        {
            //가장 긴 변이 a인 경우 
            for(int i=a-b+1; i<=a; i++)
            {
                answer++;
            }
       
            //나머지 한 변이 가장 긴 변인 경우
            for(int i=a+1; i<a+b; i++)
            {
                answer++;
            }
        }
        
        
    
        return answer;
    }
}