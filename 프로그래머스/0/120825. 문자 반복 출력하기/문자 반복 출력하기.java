class Solution {
    public String solution(String my_string, int n) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=0; i<my_string.length(); i++)
        {
            char ch = my_string.charAt(i);
            
            answer.append(String.valueOf(ch).repeat(n));
        }
        
        return answer.toString();
    }
}