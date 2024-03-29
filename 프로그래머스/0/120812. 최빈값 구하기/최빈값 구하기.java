class Solution {
    public int solution(int[] array) {
        int[] index = new int[1000+1];
        int mode = 0;
        int max = index[0];
        
        for(int i = 0; i < array.length; i++) {
            index[array[i]]++;
        }
        
        for(int i = 0; i < index.length; i++) {
            if(index[i] > max) {
                max = index[i];
                mode = i;
            } else if(index[i] == max) {
                mode = -1;
            }
        }
        return mode;
    }
}