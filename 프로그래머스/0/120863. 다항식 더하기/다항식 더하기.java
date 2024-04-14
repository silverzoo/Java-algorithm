class Solution {
    public String solution(String polynomial) {
        int literalX = 0; //계수
        int literal = 0; //상수
        String answer = "";
        
        for(String str : polynomial.split(" ")) {
            if(str.contains("x")) {
                literalX += (str.equals("x")) ? 1 : Integer.parseInt(str.replace("x", ""));
            } else if(!(str.equals("+"))) {
                literal += Integer.parseInt(str);
            }
        }
        
        //계수만 존재할 때
        if (literalX != 0 && literal == 0) {
            if (literalX == 1) {
                answer = "x";
            } else {
                answer = literalX + "x";
            }
        }
        //계수와 상수 모두 존재할 때
        if (literalX != 0 && literal != 0) {
            if (literalX == 1) {
                answer = "x + " + literal;
            } else {
                answer = literalX + "x + " + literal;
            }
        }
        //상수만 존재할 때
        if (literalX == 0 && literal != 0) {
            answer = String.valueOf(literal);
        }

        return answer;
    }
}