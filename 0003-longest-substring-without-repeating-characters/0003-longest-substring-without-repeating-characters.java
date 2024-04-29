import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 1;
        int len = s.length();
        if(len == 0) {
            return 0;
        }
        int[] maxLen = new int[len];
        maxLen[0] = 1;
        for(int i = 1; i < s.length(); i++) {
            String temp = s.substring(i-maxLen[i-1], i);
            String cur = s.substring(i, i+1);
            if(temp.contains(cur)) {
                maxLen[i] = temp.length() - temp.indexOf(cur);
            }else {
                maxLen[i] = maxLen[i-1] + 1;
            }
            answer = Math.max(answer, maxLen[i]);
        }
        return answer;
    }
}