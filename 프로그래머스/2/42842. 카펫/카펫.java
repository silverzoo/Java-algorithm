class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;
        
        for (int row = area; row > 1; row--) {
            if (area % row == 0) {
                int col = area / row;
                if ((row * 2 + (col - 2) * 2) == brown) {
                    answer[0] = row;
                    answer[1] = col;
                    return answer;
                }
            }
        }
        return answer;

    }
}