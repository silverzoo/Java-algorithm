package ch03_search.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Practice07 {
    public static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return STR. "\{name} \{height} \{vision}";
        }

        //시력의 내림차순을 정렬하기 위한 comparator
        public static final Comparator<PhyscData> VISION_ORDER =
                new VisionOrderComparator();

        private static class VisionOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.vision > d2.vision)? 1: (d1.vision < d2.vision)? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //시력 오름차순으로 정렬
        PhyscData[] x = {
                new PhyscData("강민하", 162, 0.3),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("황지안", 169, 0.8),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("김찬우", 173, 1.7),
                new PhyscData("장경오", 174, 1.8),
                new PhyscData("박준서", 175, 2.0),
        };

        System.out.print("시력이 몇인 사람을 찾고 있나요?: ");
        double vision = sc.nextDouble();
        int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision), PhyscData.VISION_ORDER);

        if (idx < 0)
            System.out.println("그 값의 요소가 없습니다.");
        else {
            System.out.println(STR."그 값은 x[\{idx}]에 있습니다.");
            System.out.println(STR."찾은 데이터: \{x[idx]}");
        }
    }
}
