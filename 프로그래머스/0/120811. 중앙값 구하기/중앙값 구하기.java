import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        int idx = (array.length+1)/2-1;
        
        answer = array[idx];
        
        return answer;
    }
}