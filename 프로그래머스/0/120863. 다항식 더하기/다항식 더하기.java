class Solution {
    public String solution(String polynomial) {
        StringBuilder answer = new StringBuilder();
        int x0 = 0; // 상수항
        int x1 = 0; // 일차항
        
        polynomial = polynomial.replaceAll("\\s", ""); //공백제거
        String str[] = polynomial.split("\\+");
        
        for(int i = 0; i < str.length; i++) {
            String s = str[i];
            
            if(s.contains("x")) {
                if(s.length() == 1) {
                    x1 += 1;
                } 
                else
                {
                    String sub[] = s.split("x");
                    
                    x1 +=Integer.parseInt(sub[0]);
                    
                } 
            } else {
                x0 += Integer.parseInt(s);
            }
        }
        
        
        //상수항과 일차항 모두 존재 
        if(x0!=0&&x1!=0)
        {
            if(x1==1)
            {
                answer.append("x");
                answer.append(" + ");
                answer.append(String.valueOf(x0));
            }
            else
            {
                answer.append(String.valueOf(x1));
                answer.append("x");
                answer.append(" + ");
                answer.append(String.valueOf(x0));
            }
        }
        //일차항만 존재 
        else if(x0==0&&x1!=0)
        {
            if(x1==1)
            {
                answer.append("x");
            }
            else
            {
                answer.append(String.valueOf(x1));
                answer.append("x");
            }
        }
        //상수항만 존재 
        else if(x1==0&x0!=0)
        {
            answer.append(String.valueOf(x0));
        }
        
        return answer.toString();
    }
}