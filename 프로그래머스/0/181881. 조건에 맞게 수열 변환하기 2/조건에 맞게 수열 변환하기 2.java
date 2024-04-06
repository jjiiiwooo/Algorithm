import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        
        while(true)
        {
            int next[] = Arrays.copyOf(arr,arr.length);
            
            for(int i=0; i<arr.length; i++) 
            {
                if(arr[i]>=50 && arr[i]%2 == 0)
                {
                    next[i] = arr[i] /2;
                }
                else if(arr[i]<50 && arr[i]%2 ==1)
                {
                    next[i] = arr[i]*2 +1;
                }
            }
            
            if(Arrays.equals(arr,next))
                break;
            
            arr = Arrays.copyOf(next, next.length);
            answer++;
        }
        
        return answer;
    }
}