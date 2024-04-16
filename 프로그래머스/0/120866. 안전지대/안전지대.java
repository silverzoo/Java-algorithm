class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        String[][] arr = new String[board.length][board.length];
        //새 2차배열 arr에 지뢰좌표와 일치한 인덱스의 요소에 x를 대입한다.
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    arr[i][j] = "x";
                } else arr[i][j] = "o";
            }
        }
        //요소값이 x인 arr배열의 인덱스를 반환하여 board배열에 대입, 위험지역을 1로 바꿔준다.
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i][j].equals("x")) {
                    //가장자리에 위치한 지뢰의 경우, IndexOutOfBoundsException 예외처리 필요.
                    if(i > 0) board[i-1][j] = 1;
                    if(i < arr.length-1) board[i+1][j] = 1;
                    if(j > 0) board[i][j-1] = 1;
                    if(j < arr.length-1) board[i][j+1] = 1;
                    if(i > 0 && j > 0) board[i-1][j-1] = 1;
                    if(i < arr.length-1 && j > 0) board[i+1][j-1] = 1;
                    if(i > 0 && j < arr.length-1) board[i-1][j+1] = 1;
                    if(i < arr.length-1 && j < arr.length-1) board[i+1][j+1] = 1;
                }
            }
        }
        //최종적으로 안전지역(0인 지역)의 수를 셈한다.
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(!(board[i][j] == 1)) answer++;
            }
        }
        return answer;
    }
}
//IndexOutOfBoundsException 예외처리에서 고전했던 문제.
//객체지향적 접근: 지뢰가 있는 위험지역 처리를 위한 메서드로 리팩토링 해보기.