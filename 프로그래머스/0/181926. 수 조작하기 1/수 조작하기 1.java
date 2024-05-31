class Solution {
    public int solution(int n, String control) {
        for(char c : control.toCharArray()) {
            n += switch(c) {
                case 'w' -> 1;
                case 's' -> -1;
                case 'd' -> 10;
                case 'a' -> -10;
                default -> 0;
            };
        }
        return n;
    }
}

//향상된 switch문 사용