import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        List<Integer> numbers = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s, " ");
        
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.equals("Z")) {
                if (!numbers.isEmpty()) {
                    answer -= numbers.remove(numbers.size() - 1);
                }
            } else {
                numbers.add(Integer.parseInt(token));
                answer += Integer.parseInt(token);
            }
        }
        return answer;
    }
}
