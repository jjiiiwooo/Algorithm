class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        int count =0;
        for(int i=0; i<dic.length; i++)
        {
            for(int j=0; j<spell.length; j++)
            {
                if(dic[i].contains(spell[j]))
                {
                    count++;
                    
                    //spell과 일치하는 문자의 수가 spell의 길이와 같다면
                    //spell에 있는 단어를 모두 사용 한 것
                    if(count==spell.length)
                    {
                        answer=1;
                    }
                }
                    
            }
            
            //count 초기화 
            count = 0;
        }
        return answer;
    }
}