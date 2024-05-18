import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        } else {
           //리스트로 변환
            List<Integer> list = new ArrayList<>();
            for (int num : arr) {
                list.add(num);
            }

            int min = Collections.min(list); //최솟값
            list.remove((Integer) min); //최솟값 삭제

            // 배열로 변환
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}
