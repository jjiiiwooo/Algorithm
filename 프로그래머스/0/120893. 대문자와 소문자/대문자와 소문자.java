class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<my_string.length(); i++)
        {
            char cur = my_string.charAt(i);
            
            //소문자 라면
            if(cur>=97 && cur<=122)
            {
                answer.append(String.valueOf(cur).toUpperCase());
            }
            else
            {
                answer.append(String.valueOf(cur).toLowerCase());
            }
        }
        return answer.toString();
    }
}