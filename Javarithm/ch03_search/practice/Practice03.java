package ch03_search.practice;

import java.util.Arrays;

public class Practice03 {
    public static void main(String[] args) {
        int[] a = {1,9,2,9,4,6,7,9};
        int n = a.length;
        int key = 9;
        int[] idx = new int[a.length];

        int result = searchIdx(a,n,key,idx);
        System.out.println(result);
        //System.out.println(Arrays.toString(idx));
    }

    static int searchIdx(int[] a, int n, int key, int[] idx) {
        int cnt = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == key) idx[cnt++] = i;
        }

        return cnt;
    }
}
