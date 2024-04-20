class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=my_string.length()-1; i>=0; i--)
        {
            char cur = my_string.charAt(i);
            answer.append(cur+"");
        }
        
        return answer.toString();
    }
}