import java.util.*;

class Solution {
    public int solution(String s) {
        
        HashMap<String,Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        
        StringBuilder answer = new StringBuilder();
        //문자가 숫자 단어에 해당되는 지 확인 하기 위한 임시 StringBuilder
        StringBuilder temp = new StringBuilder(); 
        

        for(int i=0; i<s.length(); i++)
        {
            char cur = s.charAt(i);
            
            if(Character.isDigit(cur))
            {
                answer.append(cur);
            }
            //숫자가 아니라면, 숫자를 나타내는 단어의 일부인지 판단 
            else
            {
                //현재 문자를 임시 temp에 저장 
                temp.append(cur);
                
                if(map.containsKey(temp.toString()))
                {
                    answer.append(map.get(temp.toString()));
                    temp.setLength(0); //temp 초기화 
                }
            }
        }
        
        return Integer.parseInt(answer.toString());
    }
}