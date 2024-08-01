package ch02_array.practice;


class YMD {
    int y, m, d;

    YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    YMD after(int n) {
        YMD ymd = new YMD(this.y, this.m, this.d);
        if(n < 0) return before(-n);
        //정규표현식 사용하기
        if(ymd.m == (4|6|9|11)) {
            if(30 < ymd.d + n) {
                ymd.m++;
                ymd.d = (ymd.d+n) - 30;
            } else {
                ymd.d += n;
            }
        } else if(ymd.m == 2) {
            if(28 < ymd.d + n) {
                ymd.m++;
                ymd.d = (ymd.d+n) - 28;
            }
        } else {
            if(31 < ymd.d + n) {
                ymd.m++;
                ymd.d = (ymd.d+n) - 31;
            }
        }

        return ymd;
    }

    YMD before(int n) {
        YMD ymd = new YMD(this.y, this.m, this.d);
        if(n < 0) return after(-n);
        ymd.d -= n;
        
        
        return ymd;
    }

    public static void main(String[] args) {
        YMD ymd = new YMD(2024,5,17);
        System.out.printf("현재 날짜: %d년%d월%d일\n", ymd.y, ymd.m, ymd.d);

        YMD before = ymd.before(10);
        System.out.print("10일 전의 ");
        System.out.printf("날짜: %d년%d월%d일\n", before.y, before.m, before.d);

        YMD before2 = ymd.before(15);
        System.out.print("-15일 전의 ");
        System.out.printf("날짜: %d년%d월%d일\n", before2.y, before2.m, before2.d);

        YMD after = ymd.after(30);
        System.out.print("30일 후의 ");
        System.out.printf("날짜: %d년%d월%d일\n", after.y, after.m, after.d);

        YMD after2 = ymd.after(-23);
        System.out.print("-18일 후의 ");
        System.out.printf("날짜: %d년%d월%d일\n", after2.y, after2.m, after2.d);
    }
}

//수정 필요