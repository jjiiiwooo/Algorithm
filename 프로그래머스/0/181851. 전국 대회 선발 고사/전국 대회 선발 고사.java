import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        //key-등수 value-인덱스
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<attendance.length; i++)
        {
            if(attendance[i])
            {
                map.put(rank[i],i);
            }
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        
        //등수(key)로 오름차순 정렬
        Collections.sort(keySet);
        
        //key값 배열에 저장
        int temp[] = new int[map.size()];
        int idx=0;
        
        for(int k: keySet)
        {
            temp[idx++] = k;
        }
        
        int a = map.get(temp[0]);
        int b = map.get(temp[1]);
        int c = map.get(temp[2]);
        
        int answer = 10000*a + 100*b + c;
        
        return answer;
    }
}