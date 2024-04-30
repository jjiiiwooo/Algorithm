import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        LinkedHashSet<String> set = new LinkedHashSet<>();
        
        for(int i=0; i<my_string.length(); i++)
        {
            set.add(String.valueOf(my_string.charAt(i)));
        }
        
        
        Iterator iter = set.iterator();
        for(int i=0; i<set.size(); i++)
        {
            answer.append(iter.next());
        }
        
        return answer.toString();
    }
}