class Solution {
    public String solution(String bin1, String bin2) {
        int num1 = Integer.parseInt(bin1,2);
        int num2 = Integer.parseInt(bin2,2);
        //return Integer.toBinaryString(num1 + num2); 와 같은 의미다
        return Integer.toString(num1+num2,2);
    }
}
//Integer.toString(바꾸려는숫자,어떤진수)
//Integer.parseInt(바꾸려는 문자열,어떤진수)
//ex) Integer.parseInt("10",2) -> 십진수로 2인 숫자. 문자열"10"을 2진수로 인식하고 변환한다
//ex) Integer.parseInt("10",10) -> 십진수로 10인 숫자. 문자열"10"을 10진수로 인식하고 변환한다