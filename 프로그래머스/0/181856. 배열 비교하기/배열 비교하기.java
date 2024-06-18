class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);
        
        if(answer == 0) {
            int sum1 = 0, sum2 = 0;
            for(int i = 0; i < arr1.length; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            answer = Integer.compare(sum1, sum2);
        }
        
        return answer;
    }
}
// Integer.compare() 사용법 :
// <,=,> 순으로 True 일경우, -1 ,0 , 1의 결과가 나온다.