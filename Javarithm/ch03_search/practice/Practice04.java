package ch03_search.practice;

public class Practice04 {
    public static void main(String[] args) {
        int[] a = {1,2,3,5,6,8,9,11};
        int n = a.length;
        int key = 11;
        int idx = binSearch(a, n, key);
        if(idx == -1) System.out.println("그 값의 요소가 없습니다.");
        else System.out.println(STR."그 값은 x[\{idx}]에 있습니다.");
    }

    static int binSearch(int[] a, int n, int key) {
        System.out.print("   |");
        for (int k = 0; k < n; k++)
            System.out.printf("%4d", k);
        System.out.println();
        System.out.print(STR."---+\{"----".repeat(n)}\n");

        int pl = 0;
        int pr = n-1;

        do {
            int pc = (pl+pr) / 2;
            System.out.print("   |");
            if(pl != pc) System.out.printf(String.format("%%%ds<-%%%ds+", (pl*4)+1, (pc-pl)*4), "", "");
            else System.out.printf(String.format("%%%ds<-+",   pc * 4 + 1), "");

            if (pc != pr) System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
            else System.out.println("->");

            System.out.printf("%3d|", pc);
            for (int k = 0; k < n; k++) {
                System.out.printf("%4d", a[k]);
            }
            System.out.println("\n   |");

            if (a[pc] == key)
                return pc;
            else if (a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;
        } while (pl <= pr);

        return -1;
    }
}
