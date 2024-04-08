class Solution {
    public int solution(int order) {
        String str = order+"";
        int cnt = 0;
        
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '3' || c == '6' || c == '9') cnt++;
        }
        return cnt;
    }
}
//int -> str: Integer.toString(int n)말고 더 쉬운 방법
//문자배열로 바꿔서 반복문으로 값비교하는 더 쉬운 방법