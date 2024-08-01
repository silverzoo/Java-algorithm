package ch02_array.practice;

import java.util.Arrays;

public class Practice02 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,9,6,7};
        System.out.println(Arrays.toString(arr));
        reverseOf(arr, 0, 6);
        reverseOf(arr, 1, 5);
        reverseOf(arr, 2, 4);
        System.out.println("역순 정렬을 마쳤습니다.");
    }

    static void reverseOf(int[] arr, int a, int b) {
        System.out.println(STR."arr[\{a}]와 arr[\{b}]을 교환합니다.");

        int tmp;
        tmp = arr[b];
        arr[b] = arr[a];
        arr[a] = tmp;

        System.out.println(Arrays.toString(arr));
    }
}
