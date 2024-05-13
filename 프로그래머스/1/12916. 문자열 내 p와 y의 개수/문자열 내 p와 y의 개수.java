class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        s = s.toLowerCase(); //소문자로 변경 
        int pcnt = 0;
        int ycnt = 0;
        
        for(int i=0; i<s.length(); i++)
        {
            char cur = s.charAt(i);
            
            if(cur == 'y')
            {
                ycnt++;
            }
            else if(cur=='p')
            {
                pcnt++;
            }
        }
        
        answer = (ycnt==pcnt)?true:false;

        return answer;
    }
}