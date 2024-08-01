package ch03_search.practice;

import java.util.Arrays;

public class Practice05 {
    public static void main(String[] args) {
        int[] a = {1,3,3,3,3,8,9,11};
        int n = a.length;
        int key = 3;
        int idx = binSearch(a, n, key);
        if(idx == -1) System.out.println("그 값의 요소가 없습니다.");
        else System.out.println(STR."그 값은 x[\{idx}]에 있습니다.");
        //Arrays.binarySearch 메서드는 배열 내에 동일한 요소를 확인하는 지에 대한 테스트-> 확인하지x
        int idx2 = Arrays.binarySearch(a,key);
        System.out.println(STR."그 값은 x[\{idx2}]에 있습니다.");

    }

    static int binSearch(int[]a, int n, int key) {
        int pl = 0;
        int pr = n -1;

        do {
            int pc = (pl+pr) / 2;
            //앞 인덱스도 확인 하도록 개선한 부분
            if(a[pc] == key) {
                //다른 방식
                if(a[pc-1] == key) pr = pc;
                else return pc;
//                for(; pc > pl; pc--)
//                    //앞 인덱스가 더 이상 key값이 아닐 때 종료
//                    if(a[pc-1] != key) break;
//                return pc;
            }
            else if(a[pc] < key) pl = pc + 1;
            else pr = pc - 1;

        } while (pl <= pr);

        return -1;
    }
}
