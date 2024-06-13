class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(my_string);
        StringBuilder sf = new StringBuilder(is_suffix);
        answer = sb.reverse().indexOf(sf.reverse().toString());
        return (answer == 0)? 1 : 0;
    }
}