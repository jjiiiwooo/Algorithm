class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for (String s : order) {
            String cur = s.trim(); 
            
            switch(cur) {
                case "iceamericano":
                case "americanoice":
                case "hotamericano":
                case "americanohot":
                case "americano":
                    answer += 4500;
                    break;
                case "icecafelatte":
                case "cafelatteice":
                case "hotcafelatte":
                case "cafelattehot":
                case "cafelatte":
                    answer += 5000;
                    break;
                default:
                    answer += 4500;
            }
        }
        return answer;
    }
}
