class Solution {
    public int solution(String number) {
        int answer = 0;
        for(String str : number.split("")) {
            int num = Integer.parseInt(str);
            answer += num % 9;
        }
        return answer % 9;
    }
}