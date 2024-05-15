import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 플레이어의 이름과 인덱스를 매핑하여 해시맵에 저장
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String calling : callings) {
            int idx = map.get(calling);
            
            // 플레이어의 순서 변경
            if (idx > 0) {
                String temp = players[idx];
                players[idx] = players[idx - 1];
                players[idx - 1] = temp;
                
                // 해시맵에서도 플레이어의 순서 변경 반영
                map.put(players[idx], idx);
                map.put(players[idx - 1], idx - 1);
            }
        }
        
        return players;
    }
}
