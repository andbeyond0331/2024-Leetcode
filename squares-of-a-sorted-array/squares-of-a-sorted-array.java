class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]*nums[i]);
        }
        list.sort(Comparator.naturalOrder());
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}