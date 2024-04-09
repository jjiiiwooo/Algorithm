class Solution {
    public int solution(String myString, String pat) {
        int sublen = pat.length();
        int count = 0;
        
        for(int i=0; i<=myString.length()-sublen; i++)
        {
            if(myString.substring(i,i+sublen).equals(pat))
            {
                count++;
            }
        }
        
        return count;
    }
}