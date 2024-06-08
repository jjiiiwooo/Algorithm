import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        Arrays.sort(d); //오름차순 정렬
        
        for(int i=0; i<d.length; i++)
        {
            sum += d[i];
            
            if(sum>budget)
            {
                break;
            }
            answer +=1;
        }
        
        return answer;
    }
}