import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++)
        {
            int start = commands[i][0];
            int end = commands[i][1];
            int k = commands[i][2];

            int newarr[] = Arrays.copyOfRange(array,start-1,end);
            
            Arrays.sort(newarr);
            
            answer[i] = newarr[k-1];
        }
        return answer;
    }
}