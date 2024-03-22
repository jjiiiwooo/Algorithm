class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<index_list.length; i++)
        {
            int idx = index_list[i];
            
            if(idx>=0 && idx<my_string.length())
            {
                sb.append(my_string.charAt(idx));
            }
        }
        
        return sb.toString();
    }
}