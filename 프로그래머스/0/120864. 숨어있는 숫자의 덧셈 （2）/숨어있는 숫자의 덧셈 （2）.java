import java.util.regex.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        Pattern pattern = Pattern.compile("\\d+"); // 숫자 패턴
        Matcher matcher = pattern.matcher(my_string);
        
        while (matcher.find()) {
            answer+=Integer.parseInt(matcher.group());
        }
        return answer;
    }
}