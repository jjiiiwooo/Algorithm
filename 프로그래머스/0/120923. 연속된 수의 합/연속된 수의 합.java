import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // 시작 숫자를 정하는 범위를 변경합니다.
        for(int i = -1000; i <= 1000; i++) {
            
            int sum = 0;
            // 연속된 num개의 수를 더합니다.
            for(int j = i; j < i + num; j++)
                sum += j;
            
            // 합이 total과 일치하는지 확인하고, 일치하면 배열에 담습니다.
            if(sum == total) {
                for(int j = i; j < i + num; j++)
                    list.add(j);
            }
        }
        
        // 배열로 변환하여 반환합니다.
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i);
        
        return answer;
    }
}
