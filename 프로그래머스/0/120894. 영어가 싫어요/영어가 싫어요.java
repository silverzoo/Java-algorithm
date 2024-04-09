class Solution {
    public long solution(String numbers) {
        String[] numbersArr = {"zero", "one", "two", "three", "four",
                               "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < 10; i++) {
            numbers = numbers.replace(numbersArr[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }
}
//원래 풀고 싶었던 방식. 배열에 담아서 어떻게 처리할 수 있지 않을까..?