class Solution {
    public int solution(String[] spell, String[] dic) {
        boolean is = false;
        
        //spell과 동일한 dic의 요소의 알파벳 수로 유무를 확인한다.
        for(String d : dic) {
            int cnt = 0;
            for(String s : spell) {
                if(d.contains(s)) cnt++;
            }
            //동일한 알파벳 수가 spell수와 일치하면 true 반환 하고 break(하나라도 존재하면 true).
            if(cnt == spell.length) {
                is = true;
                break;
            }
        }
        return is ? 1 : 2;
    }
}