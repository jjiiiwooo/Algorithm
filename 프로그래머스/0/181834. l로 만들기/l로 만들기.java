class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        char ch[] = myString.toCharArray();
        
        for(int i=0; i<ch.length; i++)
        {
            if(ch[i]>=97 && ch[i]<108)
            {
                sb.append("l");
            }
            else
            {
                sb.append(String.valueOf(ch[i]));
            }
        }
        return sb.toString();
    }
}