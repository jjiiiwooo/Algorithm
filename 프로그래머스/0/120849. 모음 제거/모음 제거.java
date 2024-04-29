import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuffer answer = new StringBuffer();
        
        StringTokenizer st = new StringTokenizer(my_string,"a|i|e|o|u");
        
        while(st.hasMoreTokens())
        {
            answer.append(st.nextToken());
        }
        
        
        return answer.toString();
    }
}