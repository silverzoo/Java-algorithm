class Solution {
    public String solution(String my_string) {
        char[] vowel = {'a','e','i','o','u'};
        char[] stringArr = my_string.toCharArray();
        String answer = "";
        
        for(int i = 0; i < stringArr.length; i++) {
            for(int j = 0; j < vowel.length; j++) {
                if (stringArr[i] == vowel[j]) {
                    stringArr[i] = 'X'; //소문자와 공백으로만 이루어져있다는 조건이란 전제하.
                    break;
                }
            }
        }
        
        for(int i = 0; i < stringArr.length; i++) {
            if (stringArr[i] != 'X') {
                answer += stringArr[i];
            }
        }
        
        return answer;
    }
}