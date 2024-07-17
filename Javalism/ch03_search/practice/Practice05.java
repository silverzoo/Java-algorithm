package ch03_search.practice;

public class Practice05 {
    public static void main(String[] args) {
        int[] a = {1,3,3,3,3,8,9,11};
        int n = a.length;
        int key = 3;
        int idx = binSearch(a, n, key);
        if(idx == -1) System.out.println("그 값의 요소가 없습니다.");
        else System.out.println(STR."그 값은 x[\{idx}]에 있습니다.");

    }

    static int binSearch(int[]a, int n, int key) {
        int pl = 0;
        int pr = n -1;

        do {
            int pc = (pl+pr) / 2;
            //앞 인덱스도 확인 하도록 개선한 부분
            if(a[pc] == key) {
                for(; pc > pl; pc--)
                    //앞 인덱스가 더 이상 key값이 아닐 때 종료
                    if(a[pc-1] != key) break;
                return pc;
            }
            else if(a[pc] < key) pl = pc + 1;
            else pr = pc - 1;

        } while (pl <= pr);

        return -1;
    }
}
