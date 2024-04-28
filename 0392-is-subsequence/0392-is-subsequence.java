class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;
        if(s.length()==0) {
            return true;
        }
        if(t.length()==0) {
            return false;
        }
        for(int i =0; i < t.length(); i ++) {
            if(s.charAt(idx) == t.charAt(i)){
                idx++;
                if(idx==s.length()) {
                    return true;
                }
            }
        }
        // System.out.println(idx);
        // if(idx==s.length()){
        //     return true;
        // }
        return false;
    }
}