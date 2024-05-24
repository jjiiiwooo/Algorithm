class Solution {
    public boolean checkDigit(String s)
    {
        boolean check = true;
        char ch[] = s.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            if(Character.isDigit(ch[i]))
            {
                 check =  true;
            }
            else
            {
                return false; //숫자가 아니라면 즉시 false 반환
            }
        }
        
        return check;
    }
    
    public boolean checkLen(String s)
    {
        if(s.length()==4 || s.length()==6)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean solution(String s) {
        boolean answer = false;
        
        if(checkLen(s)&&checkDigit(s))
        {
            answer = true;
        }
        return answer;
    }
}