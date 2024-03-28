import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        ArrayList<String> prefixList = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++)
        {
            String temp = my_string.substring(0,i);
            prefixList.add(temp);
        }
        
        if(prefixList.contains(is_prefix))
        {
            answer = 1;
        }
        else
        {
            answer = 0;
        }
        return answer;
    }
}