class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
        int answer = list.size();
        for(int i = 0; i < nums.length; i++) {
            if(list.isEmpty()) {
                nums[i] = 0;
            }else{
                nums[i] = list.get(0);
                list.remove(0);
            }
        }
        return answer;
    }
}