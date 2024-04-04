import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> before = new ArrayList<>();
        ArrayList<Integer> after = new ArrayList<>();
        ArrayList<Integer> join = new ArrayList<>();
        
        for(int i=n; i<num_list.length; i++)
        {
            before.add(num_list[i]);
        }
        
        for(int i=0; i<n; i++)
        {
            after.add(num_list[i]);
        }
        
        join.addAll(before);
        join.addAll(after);
        
        int answer[] = new int[join.size()];
        
        for(int i=0; i<join.size(); i++)
        {
            answer[i] = join.get(i);
        }
        
        return answer;
    }
}