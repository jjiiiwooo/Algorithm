class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int sum = 0;
        
        for(int i=0; i<numbers.length; i++)
        {
            while(sum<=n)
            {
                sum+=numbers[i];
                break;
            }
        }
        
        answer = sum;
        return answer;
    }
}