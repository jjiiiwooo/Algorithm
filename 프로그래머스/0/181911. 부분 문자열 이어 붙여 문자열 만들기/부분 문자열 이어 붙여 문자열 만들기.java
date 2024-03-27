class Solution {
    public String solution(String[] my_strings, int[][] parts) {
      String answer ="";
        
        int len = my_strings.length;
        
        for(int i=0; i<len; i++)
        {
            int x = parts[i][0];
            int y = parts[i][1];
                
            String str = my_strings[i];
                
            String sub = str.substring(x,y+1);
                
            answer += sub;
        }
        return answer;
    }
}