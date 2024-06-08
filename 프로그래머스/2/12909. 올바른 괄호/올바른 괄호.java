import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();
        
        for(String str : s.split("")) {
            if(str.equals("(")) {
                stack.push("(");
            } else if(str.equals(")")) {
                //해당 if조건을 걸지 않으면 EmptyStackException 컴파일에러가 발생한다.
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

//stack.isEmpty() 와 stack.emtpy()는 동일한 기능이다. 비어있으면.true를 반환.
//empty()는 스택 클래스의 메서드이지만,
//isEmpty()는 Collection 인터페이스에 정의된 메서드이므로 List,Set,Queue 등 여러 데이터 구조에도 사용가능한 메서드다.
