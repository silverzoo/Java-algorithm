class Solution {
    boolean solution(String s) {
        int cnt = 0;
        
        //)이면 cnt -= 1 => cnt < 0 이거나 cnt > 0 이면 false
        //(이면 cnt += 1 => cnt == 0 이면 true
        for(String str : s.split("")) {
            cnt += (str.equals(")"))? -1 : 1;
            if(cnt < 0) return false;
        }

        return (cnt == 0)? true : false;
    }
}




        //처음의 아이디어 :
        //)로 시작하면 false
        //(로 시작하면 연속된 개수를 세고 그 개수만큼 )가 연속으로 나와야 함 그렇지 않으면 false