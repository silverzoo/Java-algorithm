class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.indexOf(my_string.charAt(i)) == i)
                answer += my_string.charAt(i);
        }
        return answer;
    }
}
//indexOf는 해당 문자가 발견되는 가장 처음의 인덱스를 반환한다.
//문자의 인덱스와 가장 처음의 인덱스가 일치하면 중복이 없는 것이다. 일치하지 않으면? 중복된 문자라는 것.