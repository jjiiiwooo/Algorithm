import java.util.*;


class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        //리스트로 변환 
        List<Integer> arrlist = new ArrayList<>();
        List<Integer> deletelist = new ArrayList<>();
        
        for(int i=0; i<arr.length;i++)
        {
            arrlist.add(arr[i]);
        }
        
        for(int i=0; i<delete_list.length; i++)
        {
            deletelist.add(delete_list[i]);
        }
        
        for(int i=0; i<deletelist.size(); i++)
        {
            if(arrlist.contains(deletelist.get(i)))
            {
                arrlist.remove(deletelist.get(i));
            }
        }
        
        int answer[] = new int[arrlist.size()];
        
        for(int i=0; i<arrlist.size(); i++)
        {
            answer[i] = arrlist.get(i);
        }
        
        return answer;
    }
}

