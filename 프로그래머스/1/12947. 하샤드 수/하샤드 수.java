class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0; //각 자릿수 합 
        
        String s = String.valueOf(x);
        for(int i=0; i<s.length(); i++)
        {
            sum+=s.charAt(i) -'0';
        }
        
        //x가 sum으로 나누어지는 지 확인 
        answer = (x%sum==0)?true:false;
        return answer;
    }
}