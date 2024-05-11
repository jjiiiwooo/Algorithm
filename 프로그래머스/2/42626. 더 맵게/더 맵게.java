import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // 차례대로 추출하기 위해 우선순위 큐에 모두 삽입
        for(int s : scoville) {
            pq.add(s);
        }
        
        int answer = 0; // 처음에는 섞지 않았으므로 0으로 초기화
        
        // 모든 음식의 스코빌 지수가 K 이상인지 검사
        while(pq.peek() < K) {
            // 음식이 하나만 남았는데도 K 이상이 아니면 불가능한 경우이므로 -1 반환
            if (pq.size() == 1) {
                return -1;
            }
            
            // 두 음식을 섞어서 새로운 음식을 만들어 삽입
            pq.add(pq.poll() + (pq.poll() * 2));
            answer++; // 실제로 섞은 횟수를 증가시킴
        }
        
        return answer;
    }
}
