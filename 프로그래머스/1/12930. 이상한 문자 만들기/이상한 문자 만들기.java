class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                answer.append(" ");
                idx = 0;
            }
            else
            {
                if(idx%2==0)
                {
                    char c = Character.toUpperCase(s.charAt(i));
                    answer.append(String.valueOf(c));
                    idx++;
                }
                else
                {
                    char c = Character.toLowerCase(s.charAt(i));
                     answer.append(String.valueOf(c));
                    idx++;
                }
            }
        }
        
        return answer.toString();
    }
}