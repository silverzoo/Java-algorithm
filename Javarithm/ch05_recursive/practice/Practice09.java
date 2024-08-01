package ch05_recursive.practice;

public class Practice09 {
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
        for(int j = 0; j < 8; j++) {
            if(!flag_a[j] && !flag_b[i+j] && !flag_c[i-j+7]) {
                pos[i] = j;
                if (i == 7) print();
                else {
                    flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = true;
                    set(i + 1); //다음 열에 퀸 배치
                    flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = false;
                }
            }
        }

    }
    public static void main(String[] args) {
        set(0);
    }
}
