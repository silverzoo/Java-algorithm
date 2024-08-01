package ch02_array.practice;

import java.util.Scanner;

class Practice07 {

    static final int VMAX = 21;        // 시력의 분포(0.0부터 0.1 단위로 21개)

    static class PhyscData {
        String name;            // 이름
        int    height;          // 키
        double vision;          // 시력

        //--- 생성자(constructor) ---//
        PhyscData(String name, int height, double vision) {
            this.name     = name;
            this.height = height;
            this.vision = vision;
        }
    }

    //--- 시력의 분포를 구함 ---//
    static void distVision(PhyscData[] dat, int[] dist) {
        int i = 0;

        dist[i] = 0;
        for (i = 0; i < dat.length; i++)
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                dist[(int)(dat[i].vision * 10)]++;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("강민하", 162, 0.3),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("박준서", 175, 2.0),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("황지안", 169, 0.8),
        };
        int[] vdist = new int[VMAX];                    // 시력의 분포

        distVision(x, vdist);                                    // 시력의 분포를 구함

        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f～: ", i / 10.0);
            for (int j = 0; j < vdist[i]; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
