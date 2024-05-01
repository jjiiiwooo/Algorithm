class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        
        char temp[] = new char[cipher.length()+1];
        int idx = 1;
        
        for(int i=0; i<cipher.length(); i++)
        {
            temp[idx++]= cipher.charAt(i);
        }
        
        for(int i=code; i<temp.length; i++)
        {
            if(i%code==0)
            {
                answer.append(String.valueOf(temp[i]));
            }
        }
        
        
        return answer.toString();
    }
}