package ch05_recursive.practice;

import java.util.Scanner;

public class Practice04 {
    // 상향식 분석
    static void recur2(int n) {
        if (n > 0) {
            recur2(n - 2);
            System.out.println(n);
            recur2(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in);
        System.out.print("정수를 입력하세요: "); int x = stdln.nextInt();
        recur2(x);
    }
}

//하향식 분석: 위에서 아래로 호출 순서를 표현하며, 왼쪽 아래에서부터 리턴 되며 위로 올라가는 구조
//상향식 분석: 실행 순서의 맨 마지막(콜 스택의 최상단)에서 위로 가는 과정을 분석하는 방법