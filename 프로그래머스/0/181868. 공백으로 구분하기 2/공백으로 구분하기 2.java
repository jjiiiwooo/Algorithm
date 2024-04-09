import java.util.StringTokenizer;

class Solution {
    public String[] solution(String my_string) {
        my_string = my_string.trim(); //앞 뒤 공백 제거 
        
        StringTokenizer token = new StringTokenizer(my_string," ");
        
        String answer[] = new String[token.countTokens()];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = token.nextToken();
        }
        
        return answer;
    }
}
