import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> temp = new ArrayList<>();
        
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==2)
            {
                temp.add(i); //값이 2인 인덱스 리스트에 추가 
            }
        }
        
        if(temp.size()==0) {
            int[] answer1 = {-1};
            return answer1;
        }
        else
        {
            int start = temp.get(0);
            int end = temp.get(temp.size()-1);
        
            int answer[] = new int[end-start+1];
            int idx=0;
            for(int i=start; i<=end; i++)
            {
                answer[idx++] = arr[i];
            }
            
            return answer;
        }
        
    }
}