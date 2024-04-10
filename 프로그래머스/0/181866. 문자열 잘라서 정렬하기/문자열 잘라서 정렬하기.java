import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String myString) {
        
        ArrayList<String> list = new ArrayList<>();
        
        myString = myString.replace("x"," ");
        
        String temp[] = myString.split(" ");
        
        for(int i=0; i<temp.length; i++)
        {
            if(temp[i].equals(""))
            {
                continue;
            }
            else
            {
                list.add(temp[i]);
            }
        }
        
        Collections.sort(list);
        
        String answer[] = new String[list.size()];
        
        for(int i=0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}