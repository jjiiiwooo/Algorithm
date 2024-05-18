class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        
        //키패드 배열에서 각 숫자의 좌표를 미리 저장
        int[][] keyPad = {
            {3, 1}, // 0
            {0, 0}, // 1
            {0, 1}, // 2
            {0, 2}, // 3
            {1, 0}, // 4
            {1, 1}, // 5
            {1, 2}, // 6
            {2, 0}, // 7
            {2, 1}, // 8
            {2, 2}, // 9
            {3, 0}, // *
            {3, 2}  // #
        };
        
        int leftPos[] = keyPad[10]; //왼쪽 손 초기 위치
        int rightPos[] = keyPad[11]; //오른쪽 손 초기 위치 
        
        for(int num : numbers)
        {
            if(num==1 || num==4 || num==7){
                //왼쪽 열 숫자
                answer.append("L");
                leftPos = keyPad[num];
            }
            else if(num==3 || num ==6 || num==9)
            {
                //오른쪽 열 숫자
                answer.append("R");
                rightPos = keyPad[num];
            }
            else
            {
                int targetPos[] = keyPad[num]; //가운데 열 숫자 
                
                // 맨해튼 거리 계산
                int leftDist = Math.abs(leftPos[0] - targetPos[0]) + Math.abs(leftPos[1] - targetPos[1]);
                int rightDist = Math.abs(rightPos[0] - targetPos[0]) + Math.abs(rightPos[1] - targetPos[1]);
                
                
                if(leftDist < rightDist)
                {
                    answer.append("L");
                    leftPos = targetPos; //왼손 위치를 현재 숫자로 업데이트
                }
                else if(rightDist < leftDist)
                {
                    answer.append("R");
                    rightPos = targetPos; //오른손 위치를 현재 숫자로 업데이트
                }
                else
                {
                    //거리가 같다면 
                    if(hand.equals("left"))
                    {
                        //왼손잡이는 왼손
                        answer.append("L");
                        leftPos = targetPos;//왼손 위치를 현재 숫자로 업데이트
                    }
                    else
                    {
                        answer.append("R");
                        rightPos = targetPos;//오른손 위치를 현재 숫자로 업데이트
                    }
                }
            }
        }
        
        return answer.toString();
    }
}