class Solution {
    public int isCheck(int n)
    {
        int count = 0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
    
    //합성수이면 1, 아니면 0 리턴 
    return (count>2)?1:0;
}
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++)
        {
            if(isCheck(i)==1)
            {
                answer++;
            }
        }
        
        return answer;
    }
}