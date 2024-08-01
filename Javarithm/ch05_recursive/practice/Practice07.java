package ch05_recursive.practice;

import java.util.Scanner;

public class Practice07 {
    //n은 원반 개수 x는 시작 기둥 y는 목표 기둥
    static void move(int no, int x, int y) {
        if(no > 1)
            move(no - 1, x, 6 - x - y);
        //3개의 기둥만 사용하니 3항 연산자로 1,2,3번 기둥을 각각 A,B,C 기둥으로 연결시킴
        System.out.printf("원반[%d]을(를) %s 기둥에서 %s 기둥으로 옮김\n", no, (x == 1)? "A" : (x == 2)? "B" : "C", (y == 1)? "A" : (y == 2)? "B" : "C");

        if(no > 1)
            move(no - 1, 6 - x - y, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<하노이의 탑>");
        System.out.print("원반의 개수: "); int n = sc.nextInt();

        move(n, 1, 3);
    }
}
