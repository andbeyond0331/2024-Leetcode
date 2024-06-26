class Solution {
    public int search(int[] nums, int target) {
        int answer = -1;
        if(nums.length==1) {
            if(nums[0] == target) {
                return 0;
            }else{
                return answer;
            }
        }
        int left = 0;
        int right = nums.length-1;
        int mid = (left + right)/2;
        while(left<=right) {
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid]>target) {
                right = mid-1;
                
            } else {
                left = mid+1;
            }
            mid = (left + right)/2;
        }
        return answer;
    }
}