import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        int answer[] = new int[k];
        Arrays.fill(answer,-1);
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
            if(!list.contains(arr[i]))
            {
                list.add(arr[i]);
            }
        }

        
        if(list.size()>k)
        {
            for(int i=0; i<k; i++)
            {
                answer[i] = list.get(i);
            }
        }
        else
        {
            for(int i=0; i<list.size(); i++)
            {
                answer[i] = list.get(i);
            }
        }
        
        
        
        return answer;
        
    }
}
