class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        char c[] = code.toCharArray();
        
        for(int i=0; i<c.length; i++)
        {
            if(i%q == r)
            {
                answer += String.valueOf(c[i]);
            }
        }
        
        
        return answer;
    }
}