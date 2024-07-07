import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate day1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate day2 = LocalDate.of(date2[0], date2[1], date2[2]);
        
        return (day1.isBefore(day2)) ? 1 : 0;
    }
}
//LocalDate.of 는 파라미터에 들어오는 인자값을 날짜형식으로 바꿔주는 인스턴스 메서드
