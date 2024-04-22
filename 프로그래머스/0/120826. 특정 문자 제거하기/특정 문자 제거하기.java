class Solution {
    public String solution(String my_string, String letter) {
        StringBuffer answer = new StringBuffer();
        
        for(int i=0; i<my_string.length(); i++)
        {
            char cur = my_string.charAt(i);
            
            if(String.valueOf(cur).equals(letter))
            {
                continue;
            }
            else
            {
                answer.append(String.valueOf(cur));
            }
        }
        
        
        return answer.toString();
    }
}