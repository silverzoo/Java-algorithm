class Solution {
    public String solution(String n_str) {
        StringBuilder sb = new StringBuilder();
        String[] str = n_str.split("");
        int idx = 0;
        
        for(int i = 0; i < str.length; i++) {
            if(!str[i].equals("0")) {
                idx = i;
                break;
            }
        }
        
        for(int j = idx; j < str.length; j++) {
            sb.append(str[j]);
        }
        
        return sb.toString();
    }
}