package ch02_array.practice;

import java.util.Arrays;

public class Practice04 {
    public static void main(String[] args) {
        int[] b = {2,5,1,3,9,6,7};
        int[] a = new int[b.length];

        System.out.println(STR."a: \{Arrays.toString(a)}");
        System.out.println(STR."b: \{Arrays.toString(b)}");
        copy(a,b);
    }

    static void copy(int[] a, int[] b) {
        System.out.println(STR."\nb배열의 모든 요소를 a에 복사하기");

        for(int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }

        System.out.println(STR."a: \{Arrays.toString(a)}");
        System.out.println(STR."b: \{Arrays.toString(b)}");
        System.out.println(STR."복사 완료");
    }
}
