class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        int answer = 0;
        
        int len = num_list.length;
        
        for(int i=0; i<len; i++)
        {
           if(len>=11)
           {
               sum+=num_list[i];
           } 
           else
           {
               mul*= num_list[i];
           }
        }
        
        answer = (len>=11)?sum:mul;
        return answer;
    }
}