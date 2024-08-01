package ch01_basic;

import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;

        System.out.println("2자리의 양수를 입력하시오.");

        do {
            System.out.print("no값: "); no = sc.nextInt();
        //} while (no < 10 || no > 99);
        } while (!(no >= 10 && no <= 99));

        System.out.println(String.format("변수 no의 값은 %d이 되었습니다.", no));
    }
}

//드모르간 법칙:
//각 조건을 부정하고 &&을 ||로 하는 것과,
// ||를 &&로 바꾸고 전체를 부정하면 서로 같은 의미이다.
