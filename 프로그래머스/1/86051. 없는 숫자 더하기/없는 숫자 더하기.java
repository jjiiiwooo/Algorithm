class Solution {
    public int solution(int[] numbers) {
        int answer = 45; //0~9까지의 총합 
        
        for(int i=0; i<numbers.length; i++)
        {
            answer-=numbers[i];
        }
        return answer;
    }
}