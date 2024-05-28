import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        //strings[i]의 n번째 인덱스의 문자순으로 오름차순 정렬 
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2)
            {
                char c1 = o1.charAt(n);
                char c2 = o2.charAt(n);
                
                if(c1==c2)
                {
                    return o1.compareTo(o2);
                }
                else
                {
                    return Character.compare(c1,c2);
                }
            }
        });
        return strings;
    }
}