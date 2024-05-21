class Solution {
    public int count (int n)
    {
        int cnt = 0; //약수의 개수 
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                cnt++;
            }
                
        }
        
        return cnt;
    }
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++)
        {
            if(count(i)%2==0)
            {
                //개수가 짝수 
                answer+=i;
            }
            else
            {
                //개수가 홀수
                answer-=i;
            }
        }
        return answer;
    }
}