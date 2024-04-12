import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        
        int answer[] = new int[num_list.length-5];
        
        answer = Arrays.copyOfRange(num_list,5,num_list.length);
        
        return answer;
    }
}