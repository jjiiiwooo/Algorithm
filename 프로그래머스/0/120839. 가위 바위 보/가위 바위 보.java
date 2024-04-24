class Solution {
    public String solution(String rsp) {
        StringBuffer answer = new StringBuffer();
        
        //가위 2, 바위 0, 보 5
        for(int i=0; i<rsp.length(); i++)
        {
            char cur = rsp.charAt(i);
            
            if(String.valueOf(cur).equals("2"))
            {
                answer.append("0");
            }
            else if(String.valueOf(cur).equals("0"))
            {
                answer.append("5");
            }
            else if(String.valueOf(cur).equals("5"))
            {
                answer.append("2");
            }
            
        }
        
        
        return answer.toString();
    }
}