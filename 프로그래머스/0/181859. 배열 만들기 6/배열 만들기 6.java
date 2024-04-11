import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(list.isEmpty() || list.get(list.size() - 1) != arr[i])             {
                list.add(arr[i]);
            } else {
                list.remove(list.size() - 1);
            }
        }
        
        if(list.isEmpty()) {
            int[] empty = new int[1];
            empty[0] = -1;
            return empty;
        } else {
            int[] answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}
