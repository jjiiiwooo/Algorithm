import java.util.ArrayList;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        ArrayList<Integer>list = new ArrayList<>();
        
        for(int n : numbers)
        {
            list.add(n);
        }
        
        if(direction.equals("right"))
        {
            int temp = list.remove(numbers.length-1);
            list.add(0,temp);
        }
        else
        {
            int temp = list.remove(0);
            list.add(temp);
        }
        
        int answer[] = new int[list.size()];
        for(int i=0; i<list.size(); i++)
        {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}