package ch05_recursive;

import java.util.Scanner;

public class RecurX2 {
    static void recur(int n) {
        IntStack s = new IntStack(n);

        while (true) {
            if(n > 0) {
                //1. n값을 스택에 푸시
                s.push(n);
                //2. n-1
                n = n -1;
                //3.while 문 앞으로 다시 돌아감
                continue;
            }
            if(s.isEmpty() != true) {
                n = s.pop();
                System.out.println(n);
                n = n -2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner stdln = new Scanner(System.in);
        System.out.print("정수를 입력하세요: "); int x = stdln.nextInt();
        recur(x);
    }
}
