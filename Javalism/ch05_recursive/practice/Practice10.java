package ch05_recursive.practice;

public class Practice10 {
    static boolean[] flag_a = new boolean[8]; //각 행에 퀸을 이미 배치했는지 체크
    static boolean[] flag_b = new boolean[15]; //대각선 방향의 퀸을 이미 배치했는지 체크
    static boolean[] flag_c = new boolean[15]; //대각선 방향의 퀸을 이미 배치했는지 체크
    static int[] pos = new int[8]; //각 열에 있는 퀸의 위치

    static void print() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++)
                System.out.printf("%2s", (pos[i]==j)? "■" : "□");
            System.out.println();
        }
        System.out.println();
    }

    //i는 열 j는 행
    static void set(int i) {
        int j;
        int[] jstk = new int[8];
        //중첩 반복문일 때 원하는 반복으로 한 번에 돌아가는 방법.
        Start : while (true) {
            j = 0;
            while (true) {
                while (j < 8) {
                    if (!flag_a[j] && !flag_b[i + j] && !flag_c[i - j + 7]) {
                        pos[i] = j;
                        if (i == 7)
                            print();
                        else {
                            flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                            jstk[i++] = j;
                            continue Start; //원하는 중첩 반복문으로 바로 돌아갈 수 있다.
                        }
                    }
                    j++;
                }
                if (--i == -1) return;
                j = jstk[i];
                flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        set(0);
    }
}
