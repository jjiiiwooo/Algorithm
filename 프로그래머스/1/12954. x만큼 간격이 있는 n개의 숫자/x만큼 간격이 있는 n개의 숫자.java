class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        int idx =0;
        for(int i=0; i<n;i++)
        {
            answer[idx++] = (x+((long)i*x));
        }
        return answer;
    }
}