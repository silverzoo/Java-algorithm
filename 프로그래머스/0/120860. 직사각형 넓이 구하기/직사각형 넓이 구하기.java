class Solution {
    public int solution(int[][] dots) {
        int maxX = dots[0][0];
        int minX = dots[0][0];
        int maxY = dots[0][1];
        int minY = dots[0][1];

        for(int i = 1; i < dots.length; i++) {
            maxX = (maxX < dots[i][0]) ? dots[i][0] : maxX;
            minX = (minX > dots[i][0]) ? dots[i][0] : minX;
            maxY = (maxY < dots[i][1]) ? dots[i][1] : maxY;
            minY = (minY > dots[i][1]) ? dots[i][1] : minY;
        }
        
        return (maxX - minX) * (maxY - minY);
    }
}
        //x좌표 중 가장 큰 정수 - 작은 정수 = 가로 길이
        //y좌표 중 가장 큰 정수 - 작은 정수 = 세로 길이