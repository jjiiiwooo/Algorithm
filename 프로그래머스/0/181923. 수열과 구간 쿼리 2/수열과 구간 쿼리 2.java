import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++)
        {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
        
            int temp[] = Arrays.copyOfRange(arr,s,e+1);
            Arrays.sort(temp);
            answer[i] = -1;
            
            for(int j=0; j<temp.length; j++)
            {
                if(k<temp[j])
                {
                    answer[i] = temp[j];
                    break;
                }
            }
            
        }
        return answer;
    }
}