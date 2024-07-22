package ch05_recursive.practice;

import java.util.Scanner;

public class Practice08 {
    //n은 원반 개수 x는 시작 기둥 y는 목표 기둥
    static void move(int no, int x, int y) {
        //스택
        int[] xstk = new int[100];
        int[] ystk = new int[100];
        int[] sstk = new int[100];

        //스택 포인터
        int ptr = 0;
        int sw = 0;

        while (true) {
            if (sw == 0 && no > 1) {
                xstk[ptr] = x;
                ystk[ptr] = y;
                sstk[ptr] = sw;
                ptr++;
                no = no - 1;
                y = 6  - x - y;
                continue;
            }

            System.out.printf("원반[%d]을 %d번 기둥에서 %d번 기둥으로 이동\n", no, x, y);

            if (sw == 1 && no > 1) {
                xstk[ptr] = x;
                ystk[ptr] = y;
                sstk[ptr] = sw;
                ptr++;
                no = no - 1;
                x = 6  - x - y;
                if (++sw == 2) sw = 0;
                continue;
            }
            do {
                //스택이 비어있으면
                if (ptr-- == 0)
                    return;
                //값을 저장하고 있는 x pop
                x  = xstk[ptr];
                //값을 저장하고 있는 y pop
                y  = ystk[ptr];
                //값을 저장하고 있는 sw pop
                sw = sstk[ptr] + 1;
                no++;
            } while (sw == 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("<하노이의 탑>");
        System.out.print("원반의 개수: "); int n = sc.nextInt();

        move(n, 1, 3);
    }
}
