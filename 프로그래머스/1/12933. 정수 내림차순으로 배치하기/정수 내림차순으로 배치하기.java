import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        
        String s = String.valueOf(n);
        
        String str[] = s.split("");
        
        Arrays.sort(str);
        
        for(int i=str.length-1; i>=0; i--)
        {
            sb.append(str[i]);
        }
        
        answer = Long.parseLong(sb.toString());
            
        return answer;
    }
}