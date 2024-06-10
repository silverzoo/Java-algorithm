class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ");

        for(String w : words) {
            if(w.length() == 0) {
                answer += " ";
            } else {
                answer += w.substring(0,1).toUpperCase();
                answer += w.substring(1,w.length()).toLowerCase();
                answer += " ";
            }
        }
        
        //원래 공백이 있는 문자열이 아니라면 마지막 공백 제거하고 반환
        return (s.charAt(s.length()-1) == ' ')? answer : answer.substring(0,answer.length()-1);
    }
}

        //1. 공백을 기준으로 split한 단어 배열을 만든다
        //2. 각 단어들을 처음 음절과 나머지 음절로 쪼갠다
        //3. 단어의 처음 음절은 대문자, 나머지는 소문자로 바꾸어 반환한다
        //4. 마지막 단어를 제외하고 단어 마디마다 공백을 추가해야한다