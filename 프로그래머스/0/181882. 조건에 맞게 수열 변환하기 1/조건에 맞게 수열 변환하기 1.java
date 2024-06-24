class Solution {
    public int[] solution(int[] arr) {
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] /= 2;
            } else if(arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] *= 2;
            }
        }
        
        return arr;
    }
}

//어차피 배열길이가 항상 같아서 ArrayList 쓸 필요가 없었음..