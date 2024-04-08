class Solution {
    public String solution(String my_string, String alp) {
        
        String ans = alp.toUpperCase();
        
        for(int i=0; i<my_string.length(); i++)
        {
            String cur = my_string.charAt(i)+"";
            
            if(cur.equals(alp))
            {
                my_string = my_string.replace(cur,ans);
            }
        }
        return my_string;
    }
}