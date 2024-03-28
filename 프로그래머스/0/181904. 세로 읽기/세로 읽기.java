import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i< my_string.length(); i+=m)
        {
            String str = my_string.substring(i,i+m);
            list.add(str);
        }
        
        for(String s : list)
        {
            answer += s.substring(c-1,c);
        }
        
       
        
        return answer;
    }
}