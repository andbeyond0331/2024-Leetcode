class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean answer = true;
        for(int i = 0; i < ransomNote.length(); i++){
            if(!magazine.contains(ransomNote.substring(i, i+1))) {
                answer = false;
                
                break;
            }else{
                // int index = magazine.indexOf(ransomNote.substring(i, i+1));
                magazine = magazine.replaceFirst(ransomNote.substring(i, i+1), "");
            }
        }
        return answer;
    }
}