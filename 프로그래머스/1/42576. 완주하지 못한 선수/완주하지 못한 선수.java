import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        //참여 선수 이름, 동명이인인 경우 +1 해시맵 삽입
        for(String p : participant) 
        {
            map.put(p, map.getOrDefault(p,0)+1);
            
        }
        
        //완주 선수 이름 제거 
        for(String c : completion)
        {
            int left = map.get(c);
            if(left==1) //하나만 있는 경우 키 자체를 삭제
                map.remove(c);
            else
                map.put(c,left-1);
        }
        
        //남아 있는 유일한 키(이름) 리턴
        return map.entrySet().iterator().next().getKey();
    }
}