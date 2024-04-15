class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        int idx = 0;
        if(n_str.startsWith("0"))
        {
            for(int i=0; i<n_str.length(); i++)
            {
                if(n_str.charAt(i+1)!='0')
                {
                    idx = i+1;
                    break;
                }
            }
            
        }
        
        answer = (n_str.startsWith("0"))?n_str.substring(idx,n_str.length()):n_str;
        
        
        
        
        return answer;
    }
}