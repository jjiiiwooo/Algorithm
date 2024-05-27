class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int len = p.length();
        long num1 = Long.parseLong(p);
        
        for(int i=0; i<=t.length()-len; i++)
        {
            String temp = t.substring(i,i+len);
            
            Long num2 = Long.parseLong(temp);
            
            if(num2<=num1)
            {
                answer++;
            }
        }
        return answer;
    }
}