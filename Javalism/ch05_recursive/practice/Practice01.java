package ch05_recursive.practice;

import java.util.Scanner;

public class Practice01 {
    /* 답안 풀이
    static int factorial(int n) {
        int fact = 1;

        while (n > 1)
            fact *= n--;
        return fact;
    }*/

    //4-1예제 그대로 가져와 n > 0 인 조건문 안의 로직을 감소 반복문과 곱셉 할당연산자로 구현
    static int factorial(int n) {
        if (n > 0) {
            for(int i = n-1; i > 0; i--)
                n *= i;
            return n;
        }
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();

        System.out.println(STR."\{x}의 팩토리얼은 \{factorial(x)}입니다.");
    }
}