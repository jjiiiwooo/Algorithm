class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String str = String.valueOf(order);
        
        for(int i=0; i<str.length(); i++)
        {
            char cur = str.charAt(i);
            
            if(cur=='3'||cur=='6'||cur=='9')
            {
                answer++;
            }
        }
        return answer;
    }
}