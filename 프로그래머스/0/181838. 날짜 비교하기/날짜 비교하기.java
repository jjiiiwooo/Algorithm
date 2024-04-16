import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        LocalDate d1 = LocalDate.of(date1[0],date1[1],date1[2]);
        LocalDate d2 = LocalDate.of(date2[0],date2[1],date2[2]);
        
        if(d1.isEqual(d2))
        {
            answer = 0;
        }
        
        if(d1.isBefore(d2))
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