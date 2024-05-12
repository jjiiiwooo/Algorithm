import java.util.*;

class Solution {
    public int solution(String A, String B) {
        
        Deque<String> deque = new ArrayDeque<>();
        StringBuilder result = new StringBuilder();
        
        int answer = 0; // A를 민 횟수
        
        // A 덱에 삽입
        String str[] = A.split("");
        for (int i = 0; i < str.length; i++) {
            deque.add(str[i]);
        }
        
        // pollLast()한 것을 addFirst()하기
        while (true) {
            if (!deque.isEmpty()) {
                String temp = deque.pollLast();
                deque.addFirst(temp);
            }
            
            answer++; // 민 횟수 증가 
            
            // 문자열 재구성
            result.setLength(0); // StringBuilder 초기화
            for (String s : deque) {
                result.append(s);
            }
            
            if (result.toString().equals(B)) {
                return answer;
            }
            
            // 문자열을 밀어도 B가 되지 않는 경우
            if (answer >= A.length()) {
                return -1;
            }
            
            if(A.equals(B))
                return 0;
        }
    }
}
