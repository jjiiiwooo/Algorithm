import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int len = name.length;
        
        // key: 이름, value: 그리움 점수
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                // photo[i][j]가 map의 키에 포함되어 있는지 확인하고 값 더하기
                if (map.containsKey(photo[i][j])) {
                    answer[i] += map.get(photo[i][j]);
                }
            }
        }
        return answer;
    }
}
