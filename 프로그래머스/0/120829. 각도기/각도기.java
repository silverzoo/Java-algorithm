class Solution {
    public int solution(int angle) {
        int answer = 0;
        String gak = null;
        
        if(0 < angle && angle < 90){
            gak = "예각";
        };
        if(angle == 90){
            gak = "직각";
        };
        if(90 < angle && angle < 180){
            gak = "둔각";
        };
        if(angle == 180){
            gak = "평각";
        };
        
        return switch(gak) {
            case "예각" -> 1;
            case "직각" -> 2;
            case "둔각" -> 3;
            case "평각" -> 4;
            default -> 0;
        };
    }
} //return 안에 향상된 switch문 써보고 싶어서.