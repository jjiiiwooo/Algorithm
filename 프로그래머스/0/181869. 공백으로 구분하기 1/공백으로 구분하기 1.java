import java.util.StringTokenizer;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer token = new StringTokenizer(my_string, " ");
        String answer[] = new String[token.countTokens()];
        int idx = 0;
        while(token.hasMoreTokens()) {
            answer[idx++]=token.nextToken(); 
        }
        return answer;
    }
}