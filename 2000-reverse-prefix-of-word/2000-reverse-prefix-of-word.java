class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = -1;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch) {
                idx = i;
                break;
            }
        }
        if(idx == -1) {
            return word;
        }
        String answer = "";
        for(int i = idx; i >= 0; i--) {
            answer+=word.substring(i, i+1);
        }
        answer+=word.substring(idx+1);
        return answer;
    }
}