package ch02_array;

import java.util.Scanner;

public class CardConv {
    //x를 r진수로 변환하여 배열 d에 아래자리부터 add하고 자리수 반환하기
    static int cardConv(int x, int r, char[] d) {

        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        for(int i = 0; i < digits/2; i++) {
            char tmp = d[i];
            d[i] = d[digits -i -1];
            d[digits -i -1] = tmp;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no, cd, dno, retry; //변환하는 정수, 기수, 변환 후 자리수, 다시한번?
        char[] cno = new char[32]; //변환 후 각 자리수를 넣는 배열

        System.out.println("10진수를 기수 변환합니다.");
        System.out.print("변환하는 음이 아닌 정수: "); no = sc.nextInt();

        System.out.print("어떤 진수로 변환할까요?(2~36): "); cd = sc.nextInt();

        dno = cardConv(no, cd, cno);
        System.out.print(cd + "진수로 ");
        for(int i = 0; i < dno; i++) {
            System.out.print(cno[i]);
        }
        System.out.println("입니다.");

    }
}
