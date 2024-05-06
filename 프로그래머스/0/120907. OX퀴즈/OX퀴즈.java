import java.util.ArrayList;

class Solution {
    public String[] solution(String[] quiz) {
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i=0; i<quiz.length; i++)
        {
            //공백을 기준으로 spilt
            String strarr[] = quiz[i].split(" ");
            
            int a = Integer.parseInt(strarr[0]);
            int b = Integer.parseInt(strarr[2]);
            String op = strarr[1];
            int result = Integer.parseInt(strarr[4]);
            
            if(op.equals("+"))
            {
                int temp = a+b;
                if(temp==result)
                {
                    list.add("O");
                }
                else 
                {
                    list.add("X");
                }
            }
            else if(op.equals("-"))
            {
                int temp = a-b;
                if(temp==result)
                {
                    list.add("O");
                }
                else
                {
                    list.add("X");
                }
            }           
        }
        
        String answer[] = new String[list.size()];
        for(int i=0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}