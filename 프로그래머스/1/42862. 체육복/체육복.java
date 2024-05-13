import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        HashSet<Integer> resList = new HashSet<>();
        HashSet<Integer> lostList = new HashSet<>();
        
        //1. set 만들기 
        for(int i : reserve)
            resList.add(i);
        for(int i : lost)
        {
            if(resList.contains(i))
                resList.remove(i);
            else
                lostList.add(i);
        }
        
        //2.여분을 기준으로 앞뒤를 확인하여 체육복을 빌려준다. 
        for(int i: resList) 
        {
            if(lostList.contains(i-1))
                lostList.remove(i-1);
            else if(lostList.contains(i+1))
                lostList.remove(i+1);
        }
        
        //3.최대한 나눠준 뒤에 lost에 남아있는 학생들은 체육복이 없는 학생들이다. 
        answer = n-lostList.size();
        
        return answer;
    }
}