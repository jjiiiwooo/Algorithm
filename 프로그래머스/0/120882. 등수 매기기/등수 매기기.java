import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<score.length; i++)
        {
            list.add(score[i][0]+score[i][1]);
        }
        
        //내림차순 정렬
        list.sort(Comparator.reverseOrder());
        
        for(int i=0; i<answer.length; i++)
        {
            answer[i] = list.indexOf(score[i][0]+score[i][1])+1;
        }
        return answer;
    }
}