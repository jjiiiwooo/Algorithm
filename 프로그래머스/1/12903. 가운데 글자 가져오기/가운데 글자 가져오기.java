class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        int len = s.length();
        String str[] = s.split("");
        
        if(len%2==0)
        {
            int idx = len/2;
            sb.append(str[idx-1]).append(str[idx]);
        }
        else
        {
            int idx = len/2;
            sb.append(str[idx]);
        }
       
        return sb.toString();
    }
}