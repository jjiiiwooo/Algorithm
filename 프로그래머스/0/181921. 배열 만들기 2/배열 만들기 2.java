import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=l; i<=r; i++)
        {
            String s = i+"";
            int count = 0;
            
            for(int j=0; j<s.length(); j++)
            {
                if(s.charAt(j)==48 || s.charAt(j)==53)
                {
                    count++;
                }
            }
            if(count == s.length())
            {
                list.add(i);
            }
            count = 0;
        }
        int answer[] = new int[list.size()];
        int empty[] = new int[1];
        empty[0] = -1;
        
        for(int i=0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        
        if(answer.length == 0) return empty;
        return answer;

    }
}