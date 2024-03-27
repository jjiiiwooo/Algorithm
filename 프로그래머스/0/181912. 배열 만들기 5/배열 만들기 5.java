import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<intStrs.length; i++)
        {
            String str  = intStrs[i];
            
            String result = str.substring(s,s+l);
            
            if(Integer.parseInt(result) > k)
            {
                ans.add(Integer.parseInt(result));
            }
        }
        
        int answer[] = new int[ans.size()];
        
        for(int i=0; i<ans.size(); i++)
        {
            answer[i] = ans.get(i);
        }
        
        
        
        
        return answer;
    }
}