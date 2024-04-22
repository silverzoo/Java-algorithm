class Solution {
    public int solution(int M, int N) {
        return (M > N) ? (M - 1) + (N - 1)*M : (N - 1) + (M - 1)*N;
    }
}
//result = (둘 중 큰 수 - 1) + (작은 수 - 1)*큰수