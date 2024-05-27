class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        //10진수 -> 3진수
        String str = Integer.toString(n,3);
        
        //문자열 뒤집기
        String reversed = new StringBuilder(str).reverse().toString();
        
        //reversed 문자열 10진수로 변환
        int answer = Integer.parseInt(reversed,3);
        
        
        
        return answer;
    }
}