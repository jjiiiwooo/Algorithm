import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        
        String beforestr[] = before.split("");
        String afterstr[] = after.split("");
        
        //정렬 해서 비교 
        Arrays.sort(beforestr);
        Arrays.sort(afterstr);
        
        if(Arrays.equals(beforestr,afterstr))
        {
            return 1;
        }
        else
        {
            return 0;
        }
        
    }
}