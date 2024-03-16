class Solution {
    public String solution(String code) {
        String answer = "";
        
        char ch[] = code.toCharArray();
        char mode = '0';
        
        for(int i=0; i<ch.length;i++)
        {
            if(ch[i] == '1')
            {
                mode = mode =='0'?'1':'0';
                continue;
            }
            
            if(mode == '0')
            {
                if(i%2 == 0)
                {
                    answer += ch[i];
                }
            }
            else
            {
                if(i%2!=0)
                {
                    answer+=ch[i];
                }
            }
            
        }
        
        if(answer.length()==0)
        {
            return "EMPTY";
        }
        else
        {
            return answer;
        }
    }
}