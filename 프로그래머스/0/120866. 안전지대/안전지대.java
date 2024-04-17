class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        //지뢰가 있는 셀 찾기
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    //위험지역으로 분류하기
                    changeDangerCell(board, i, j);
                }
            }
        }
        
        //안전지역인 셀 수 반환하기
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
    
    //지뢰에 인접한 8개의 셀을 위험지역으로 분류하는 메서드
    public void changeDangerCell(int[][] board, int i, int j) {
        int length = board.length;
        //인접한 8개의 셀의 좌표값을 가진 배열
        int[][] directions = {{0,-1},{0,1},{-1,-1},{-1,0},{-1,1},{1,-1},{1,0},{1,1}};
        
        for(int[] dir : directions) {
            int x = i + dir[0];
            int y = j + dir[1];
            //보드의 가장자리이거나 이미 지뢰가 매설된 지역이 아니면 위험지역(-1)로 분류하기
            if(x >= 0 && y >= 0 && x < length && y < length && board[x][y] == 0) {
                board[x][y] = -1;
            }
        }
    }
}