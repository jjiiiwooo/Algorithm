import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int num : array)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        
        //value를 기준으로 내림차순으로 정렬 
        List<Map.Entry<Integer,Integer>>list = new ArrayList<>(map.entrySet());
        list.sort((e1,e2)-> e2.getValue().compareTo(e1.getValue()));
        
        //최빈값이 중복되는지 확인
        if(list.size()>1 && list.get(0).getValue().equals(list.get(1).getValue()))
        {
            return -1;
        }
        else
        {
            return list.get(0).getKey();
        }
    }
}