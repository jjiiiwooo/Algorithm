class Solution {

    public String solution(String bin1, String bin2) {
        //2진수 -> 10진수 
        int a = Integer.parseInt(bin1,2);
        int b = Integer.parseInt(bin2,2);
        
        int sum = a+b;
        
        //10진수->2진수 
        String answer = Integer.toString(sum,2);
        
        return answer;
    }
}