class Solution {
    public int solution(int n) {
        int answer = 2;
        
        //제곱수의 제곱근 구하기
        for(int i=0; i<n/2; i++)
        {
            if(i*i==n)
            {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}