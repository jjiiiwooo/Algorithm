class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int sublen = pat.length();
        
        String newString ="";
        
        for(int i=0; i<myString.length(); i++)
        {
            char cur = myString.charAt(i);
            
            if(cur=='A')
            {
                newString+='B';
            }
            else if(cur=='B')
            {
                newString+='A';
            }
        }
        
        
        for(int i=0; i<= newString.length()-sublen; i++)
        {
            if(newString.substring(i,i+sublen).equals(pat))
            {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}