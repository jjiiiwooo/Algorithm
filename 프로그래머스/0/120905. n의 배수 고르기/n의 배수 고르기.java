import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<numlist.length; i++)
        {
            //n의 배수라면 
            if(numlist[i]%n==0)
            {
                list.add(numlist[i]);
            }
        }
        
        int answer[] = new int[list.size()];
        for(int i=0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }

        return answer;
    }
}