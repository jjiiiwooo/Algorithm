import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        //각 문자의 마지막 인덱스를 저장
        Map<Character,Integer> lastIndex = new HashMap<>();
        
        
        for(int i=0; i<s.length(); i++)
        {
            char cur = s.charAt(i);
            
            //현재 문자가 있다면
            if(lastIndex.containsKey(cur))
            {
                int lastIdx = lastIndex.get(cur); //현재 문자의 마지막 인덱스 가져옴 
                answer[i] = i-lastIdx;
            }
            else
            {
                answer[i] = -1;
            }
            
            lastIndex.put(cur,i); //문자, 현재 문자의 인덱스 map에 저장 
        }
        return answer;
    }
}