import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%divisor==0)
            {
                list.add(arr[i]);
            }
        }
        
        if(list.size()==0)
        {
            int answer[] = {-1};
            return answer;
        }
        else
        {
            int answer[] = new int[list.size()];
            int idx = 0;
            for(int n: list)
            {
                answer[idx++] = n;
            }
            
            Arrays.sort(answer);
            return answer;
        }
        
    }
}