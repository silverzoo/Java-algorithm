package ch05_recursive.practice;

import java.util.Scanner;

public class Practice02 {

    //1. x가 y에 나누어 떨어지지 않는다면 공약수 성립x
    //2. x와 y 나눗셈의 나머지(x % y)와 y, 두 수의 나눗셈을 나누어 떨어질 때 까지 반복
    //이때 나누어 떨어진 식의 피연산자 중 0이 아닌 수가 최대공약수가 된다.
    //ex) x= 12 y= 5/ x= 5 y= 2/ x= 2 y= 1/ x= 1 y= 0 -> 최대 공약수: 1
    static int gcd(int x, int y) {
        while(y > 0) {
            int tmp = y;
            y = x % y;
            x = tmp;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.print("정수를 입력하세요 : ");  int x = stdIn.nextInt();
        System.out.print("정수를 입력하세요 : ");  int y = stdIn.nextInt();

        System.out.println(STR."최대공약수는 \{gcd(x, y)}입니다.");
    }
}