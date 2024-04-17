import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        
        for(int i=0;i<picture.length;i++){
            String[] width = picture[i].split("");
            String str = "";
            
            for(int j=0;j<width.length;j++){
                str += width[j].repeat(k);
            }
            
            for(int s=0;s<k;s++){
                answer.add(str);
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}