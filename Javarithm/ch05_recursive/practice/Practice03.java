package ch05_recursive.practice;

import java.util.Scanner;

public class Practice03 {
    static int gcd(int x, int y) {
        while(y > 0) {
            int tmp = y;
            y = x % y;
            x = tmp;
        }
        return x;
    }

    //1. 최대공약수란 결국 비교하는 모든 수들이 나누어 떨어질 수 있는 수여야 함
    //2. a와 b의 최대공약수인 d가 있을 때, d와 또 다른 수 c의 최대공약수가 결국 a,b,c의 최대공약수
    //2. 최대 공약수를 담을 result 변수와 배열 첫 요소의 최대 공약수 반환
    //3. 그 반환한 값과 다음 배열의 요소를 비교하는 과정을 반복한다.
    static int gcdArray(int[] a) {
        int result = 0;
        for (int i : a) {
            result = gcd(result, i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num;
        do {
            System.out.print("몇 개 정수의 최대 공약수를 구할까요? : ");
            num = stdIn.nextInt();
        } while (num <= 1);

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print(STR."x[\{i}] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.println(STR."최대공약수는 \{gcdArray(x)}입니다.");
    }
}