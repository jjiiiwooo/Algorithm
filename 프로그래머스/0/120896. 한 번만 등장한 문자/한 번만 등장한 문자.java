import java.util.*;

class Solution {
    public String solution(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        StringBuilder answer = new StringBuilder();
        
        //각 문자별 빈도수 저장 
        for(int i=0; i<s.length(); i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        //빈도수가 1인 문자 리스트에 추가 
        for(Character c : map.keySet())
        {
            if(map.get(c)==1)
            {
                list.add(c);
            }
        }
        
        //리스트 사전순으로 정렬
        Collections.sort(list);
        
        for(char c : list)
        {
            answer.append(String.valueOf(c));
        }
        
        
        
        return answer.toString();
    }
}