import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
//String클래스가 문자배열을 인자로 받아 새 인스턴스를 생성할 수 있는 이유?
//String타입의 변수는 문자형배열 char[]을 인스턴스 변수로 정의해놓고 입력받을 때 문자형 배열로 저장된다.
//String클래스가 불변의 성격(immutable)을 띈다는 게 이런 의미.