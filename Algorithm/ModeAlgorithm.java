//최빈값 알고리즘(Mode Algorithm) : 점수 인덱스의 개수(count)의 최댓값(max)
public class ModeAlgorithm {
    public static void main(String[] args) {

        //1. input
        int[] scores = {10,5,2,30,4,10,2,10};
        int[] indexes = new int[30+1]; // 배열 조건의 최대범위+1이어야 한다
        int mode = 0; //최빈값
        int max = indexes[0]; //최빈값 카운트수

        //2. process
        for(int i = 0; i < scores.length; i++) {
            indexes[scores[i]]++;
        }

        for(int i = 0; i < indexes.length; i++) {
            if(indexes[i] > max) {
                max = indexes[i];
                mode = i;
            }
        }

        //3. output
        System.out.println("scores 데이터의 최빈값: " + mode);
        System.out.println("빈도수는: " + max);
    }
}

/* 출력
scores 데이터의 최빈값: 10
빈도수는: 3
*/
