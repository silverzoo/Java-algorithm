package ch01_basic.practice;

public class practice05 {
    public static void main(String[] args) {
        System.out.println(med5(1,5,6));
    }

    static int med5(int a, int b, int c) {
        if((b >= a && c <= a) || (b <= a && c>= a))
            return a;
        else if((a > b && c < b) || (a < b && c > b))
            return b;
        return c;
    }
}

/*
  처음 if 문의 판단 하기 위한 조건 수식이 너무 많고,
  그 반대의 조건인 else if 에서도 실질적으로
  같은 판단을 수행하므로 효율이 나빠진다.
*/