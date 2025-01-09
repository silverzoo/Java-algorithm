import java.util.*;
class Solution {
    public int[] solution(String[] gems) {
        Set<String> set = new HashSet<>();
        for(String g: gems)set.add(g);
        int totCate = set.size();
        
        int l = 0;
        int len = Integer.MAX_VALUE;
        Map<String, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        
        for(int r = 0 ; r < gems.length ; r++){
            map.put(gems[r], map.getOrDefault(gems[r], 0) + 1);
            
            while(map.get(gems[l]) > 1){
                map.put(gems[l], map.get(gems[l])-1);
                l++;
            }
            
            if(map.size() == totCate && len > r-l){
                len = r-l;
                ans[0] = l+1;
                ans[1] = r+1;
            }
        }
        
        return ans;
    }
}