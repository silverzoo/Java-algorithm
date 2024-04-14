class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0; //이동할 x좌표
        int y = 0; //이동할 y좌표
        int boardX = (int)Math.floor(board[0]/2.0); //맵의 x크기
        int boardY = (int)Math.floor(board[1]/2.0); //맵의 y크기
        
        for(String str : keyinput) {
            if(str.equals("right")) x += (x < boardX) ? 1 : 0;
            else if(str.equals("left")) x -= (x > -boardX) ? 1 : 0;
            else if(str.equals("up")) y += (y < boardY) ? 1: 0;
            else if(str.equals("down")) y -= (y > -boardY) ? 1 : 0;
        }
        
        int[] answer = { x, y };
        return answer;
    }
}
        //이동할 수 있는 최대 x거리 = (int)Math.floor(board[0]/2.0)
        //이동할 수 있는 최대 y거리 = (int)Math.floor(board[1]/2.0)
        //최종 이동거리 = Math.min(이동할 수 있는 최대거리, 총 이동거리)