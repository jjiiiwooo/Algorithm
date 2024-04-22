import java.util.ArrayList;

class Solution {
    public String solution(int age) {
        StringBuffer answer = new StringBuffer();
        ArrayList<Integer> arrAge = new ArrayList<>();
        
        char alpha[] = new char[26];
        int idx = 0;
        
        for(char i=97; i<=122; i++)
        {
            alpha[idx++] = (char)i;
        }
        
        //숫자 자릿수 리스트에 저장 
        while(age>0)
        {
            arrAge.add(age%10);
            age/=10;
        }
        
        for(int i=arrAge.size()-1; i>=0; i--)
        {
            answer.append(alpha[arrAge.get(i)]);
        }
       
        
        return answer.toString();
    }
}