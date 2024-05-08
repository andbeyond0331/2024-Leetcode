import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> ath = new HashMap<>();
        int len = score.length;
        for(int i = 0; i < len; i++) {
            ath.put(score[i], i);
        }
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        
        String[] answer = new String[len];
        
        answer[ath.get(arr[0])] = "Gold Medal";
        if(len == 1) {
            return answer;
        }
        answer[ath.get(arr[1])] = "Silver Medal";
        if(len == 2) {
            return answer;
        }
        answer[ath.get(arr[2])] = "Bronze Medal";
        if(len == 3) {
            return answer;
        }
        for(int i = 3; i < len; i++) {
            answer[ath.get(arr[i])] = String.valueOf(i+1);
        }
        return answer;
    }
}