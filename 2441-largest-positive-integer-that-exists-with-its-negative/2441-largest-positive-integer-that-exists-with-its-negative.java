import java.util.*;

class Solution {
    public int findMaxK(int[] nums) {
        int max = -1;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i = nums.length-1; i >= 0; i--) {
            if(nums[i]>0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }
        for(int i = 0; i < pos.size(); i++) {
            int temp = pos.get(i);
            if(neg.contains(temp*-1)){
                max = Math.max(max, temp);
            }
        }
        return max;
    }
}