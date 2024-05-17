class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++)
        {
            char cur = s.charAt(i);
            
            //공백일 때 
            if(cur==' ')
            {
                sb.append(' ');
            }
            else
            {
                char base = Character.isUpperCase(cur)?'A':'a';
                char shift = (char)((cur-base+n)%26+base);
                sb.append(shift);
            }
        }
        return sb.toString();
    }
}