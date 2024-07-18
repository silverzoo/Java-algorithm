package ch01_basic.practice;

import java.util.Scanner;

public class practice15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("피라미드를 그리시오.");
        int leng;

        do {
            System.out.print("몇 단입니까?: ");
            leng = sc.nextInt();
        } while(leng <= 1);

        spira(leng);
    }

    //여백과 *을 나누어 생각했을 때,
    //중앙을 기준으로 반으로 나누어서 오른쪽여백은 고려하지 않는다.
    //왼쪽 여백은 총 자릿수에서 *의 개수를 뺀 만큼만 차지하고, -((i-1)+1)인 이유는 for문 안의 변수 i가 1부터 시작 하기 때문.
    //*은 1,3,5.. 홀수씩 증가한다.
    static void spira(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n-((i-1)+1)));
            System.out.print("*".repeat((i-1)*2+1));
            System.out.println();
        }
    }

    /*
    static void spira(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (i-1)*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    */
}
