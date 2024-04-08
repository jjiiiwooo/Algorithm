class Solution {
    public String solution(String myString, String pat) {
        
        int sublen = pat.length();
        int endIndex = 0;
        for(int i=0; i<myString.length() - sublen+1; i++)
        {
            if(myString.substring(i,i+sublen).equals(pat))
            {
                endIndex = i+sublen;
            }
        }
        
        String answer = myString.substring(0,endIndex);
        
        return answer;
    }
}