import java.util.ArrayList;

class Solution {
    public String[] solution(String my_str, int n) {
        ArrayList<String> list = new ArrayList<>();
        
        //문자열 길이가 n 값에 나눠떨어지는 경우 
        for(int i=0; i< (my_str.length()/n) ; i++)
        {
            list.add(my_str.substring((n*i),(n*(i+1))));
        }
        
        //나눠떨어지지 않는 경우 
        if(my_str.length()%n !=0)
        {
            list.add(my_str.substring((my_str.length()/n)*n));
        }
        
        String answer[] = new String[list.size()];
        for(int i=0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}