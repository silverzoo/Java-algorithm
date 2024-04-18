class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        //k를 포함하는지 체크한다
        for(int scope = i; scope <= j; scope++) {
            String s = String.valueOf(scope);
            if(s.contains(String.valueOf(k))) {
                //k를 포함하는 인덱스가 몇개인지 체크한다
                for(String s2 : s.split("")) {
                    if(s2.equals(String.valueOf(k))) answer++;
                }
                
            }
        }
        return answer;
    }
}