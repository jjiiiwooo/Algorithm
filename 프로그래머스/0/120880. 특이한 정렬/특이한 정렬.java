import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numlist.length; i++)
        {
            list.add(numlist[i]);
        }
        
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2)
            {
                int gap1 = Math.abs(n1 -n);
                int gap2 = Math.abs(n2-n);
                
                //차이가 같다면
                if(gap1==gap2)
                {
                    return n2 - n1; //값이 큰 것을 기준으로 정렬
                }
                
                return gap1 - gap2;
            }
        });
        
        for(int i=0; i<answer.length; i++)
        {
            answer[i] = list.get(i);
        }

            
        return answer;
    }
}