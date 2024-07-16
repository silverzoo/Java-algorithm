package ch02_array.practice;

import java.util.Arrays;

public class Practice05 {
    public static void main(String[] args) {
        int[] b = {2,5,1,3,9,6,7};
        int[] a = new int[b.length];

        System.out.println(STR."a: \{Arrays.toString(a)}");
        System.out.println(STR."b: \{Arrays.toString(b)}");
        reverseCopy(a,b);
    }

    static void reverseCopy(int[] a, int[] b) {
        System.out.println(STR."\nb배열의 모든 요소를 a에 역순으로 복사하기");

        //요소 복사
        for(int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }

        //복사한 요소 역순으로 재정렬
        for(int i = 0; i < a.length; i++) {
            a[i] = b[b.length -i -1];
        }

        System.out.println(STR."a: \{Arrays.toString(a)}");
        System.out.println(STR."b: \{Arrays.toString(b)}");
        System.out.println(STR."역순 복사 완료");
    }
}
