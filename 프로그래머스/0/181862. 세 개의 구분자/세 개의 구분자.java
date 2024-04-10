import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        
        String[] temp = myStr.split("a|b|c");
        String[] empty = new String[1];
        Arrays.fill(empty,"EMPTY");
        
        ArrayList<String> list = new ArrayList<>();
        
        
        for(int i=0; i<temp.length; i++)
        {
            if(!(temp[i].equals("")))
                list.add(temp[i]);
        }
        
        String answer[] = new String[list.size()];
        
        for(int i=0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        
        if(list.size()==0)
        {
            return empty;
        }
        
        
        
        return answer;
    }
}