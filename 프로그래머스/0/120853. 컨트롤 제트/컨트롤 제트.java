class Solution {
    public int solution(String s) {
        int answer = 0;
        //split하여 배열에 저장
        String[] arr = s.split(" ");
        //반복문으로 숫자면 더하고 "Z"면 직전인덱스의 숫자를 뺀다
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("Z")) answer -= Integer.parseInt(arr[i-1]);
            else answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}