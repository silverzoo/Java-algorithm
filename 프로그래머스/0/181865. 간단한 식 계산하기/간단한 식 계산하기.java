class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        String op = arr[1];
        
        return op.equals("+")? a+b : (op.equals("-")? a-b : a*b);
    }
}