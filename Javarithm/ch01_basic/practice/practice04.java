package ch01_basic.practice;

public class practice04 {
    public static void main(String[] args) {
        System.out.println(med4(5,12,11));
    }

    static int med4(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }
}
