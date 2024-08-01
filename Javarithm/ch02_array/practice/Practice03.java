package ch02_array.practice;

import java.util.Arrays;

public class Practice03 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,9,6,7};
        System.out.println(Arrays.toString(arr));
        System.out.println(STR."모든 요소의 합은 \{sumOf(arr)}입니다.");
    }

    static int sumOf(int[] a) {
        int sum = 0;

        for(int value : a) {
            sum += value;
        }
        return sum;
    }
}
