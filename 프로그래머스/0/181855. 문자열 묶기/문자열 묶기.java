import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {

        //key: 문자열의 길이 value: 길이가 같은 문자열의 개수 
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(String s : strArr)
        {
            int len = s.length();
            map.put(len, map.getOrDefault(len,0)+1);
        }
        
        int max = 0;
        for(int groupSize : map.values())
        {
            max = Math.max(max,groupSize);
        }
        
        return max;
    }
}