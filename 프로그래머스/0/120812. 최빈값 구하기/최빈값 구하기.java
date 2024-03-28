class Solution {
    public int solution(int[] array) {
        int mode = 0; //최빈값 저장
        int[] index = new int[1000]; //제한사항에 맞춘 인덱스 범위
        int max = Integer.MIN_VALUE; //최대값 저장, 초기값은 정수형의 최소값
        
        for(int i = 0; i < array.length; i++) {
            index[array[i]]++;
        }
        
        for(int i =0 ; i < index.length; i++) {
            //최대값과 최빈값
            if(max < index[i]) {
                max = index[i];
                mode = i;
            } else if(max == index[i]) {
                mode = -1; //최빈값이 여러개일 때
            }
        }
        
        return mode;
    }
}