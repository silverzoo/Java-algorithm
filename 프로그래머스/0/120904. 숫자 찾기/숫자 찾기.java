class Solution {
    public int solution(int num, int k) {
        
        return ("_"+num).indexOf(String.valueOf(k));
    }
} // 인덱스0의 자리에 임의의 문자열을 추가함으로써 String변환과 자리수출력을 한번에 해결할 수 있다.