package ch05_recursive.practice;

import java.util.Scanner;

public class Practice05_6 {
    static String[] memo;
    static int cnt = 0;

    //--- 메모화를 도입한 메서드 recur ---//
    static void recur(int n) {
        cnt++;
        if (memo[n + 1] != null)
            System.out.print(memo[n + 1]);                              // 메모를 출력
        else {
            if (n > 0) {
                recur(n - 1);
                System.out.println(n);
                recur(n - 2);
                //로직 처리 후 기록을 위해 문자열을 메모
                memo[n + 1] = STR."\{memo[n]}\{n}\n\{memo[n - 1]}";        // 메모화
            } else {
                memo[n + 1] = "";     // 메모화 : recur(0)과 recur(-1)은 빈 문자열
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();

        memo = new String[x + 2];
        recur(x);
        System.out.println(STR."메서드 호출 횟수: \{cnt}");
    }
}

