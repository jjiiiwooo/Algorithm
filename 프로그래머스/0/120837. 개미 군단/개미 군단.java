public class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] ant = {5, 3, 1}; 

        for (int antType : ant) {
            answer += hp / antType; // 현재 개미 종류로 사용 가능한 개미의 수를 더함
            hp %= antType; 
        }

        return answer;
    }
}
