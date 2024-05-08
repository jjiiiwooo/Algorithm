import java.util.*;
 
class Solution {    
     
    public static void main(String args[]) throws Exception {
         
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
         
         
        for (int t = 1; t <= T; t++)
        { 
            int score[] = new int[1000];
            int answer = 0;
            
            sc.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0; i<1000; i++)
            {
                score[i] = sc.nextInt();
                 
                map.put(score[i],map.getOrDefault(score[i],0)+1);
            }
             
            List<Integer> keySet = new ArrayList<>(map.keySet());
             
            //value를 기준으로 내림차순 정렬
            List<Map.Entry<Integer,Integer>>list = new ArrayList<>(map.entrySet());
            list.sort((e1,e2)->e2.getValue().compareTo(e1.getValue()));
             
             
            //최빈값이 중복된다면
            if(list.size()>1 && list.get(0).getValue().equals(list.get(1).getValue()))
            {
                if(list.get(0).getKey()>list.get(1).getKey())
                {
                    answer = list.get(0).getKey();
                }
                else
                {
                    answer = list.get(1).getKey();
                }
            }
            else
            {
                answer = list.get(0).getKey();
            }
             
            System.out.printf("#%d %d\n",t,answer);
             
        }
    }
}