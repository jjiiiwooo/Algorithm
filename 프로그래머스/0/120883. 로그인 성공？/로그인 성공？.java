import java.util.Arrays;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for(int i=0; i<db.length; i++)
        {
            for(int j=0; j<db[i].length; j++)
            {
                //아이디 일치
                if(id.equals(db[i][0]))
                {
                    //비번 일치
                    if(pw.equals(db[i][1]))
                    {
                        answer="login";
                    }
                    else
                    {
                        answer="wrong pw";
                    }
                }
            }
        }
        return answer;
    }
}