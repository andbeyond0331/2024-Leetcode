class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] counter = new int[nums.length+1];
        for(int i = 0; i < nums.length; i++) {
            counter[nums[i]]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < counter.length; i++) {
            if(counter[i]==0) {
                list.add(i);
            }
        }
        return list;
        // List<Integer> list = new ArrayList<>();
        // for(int i = 1; i <= nums.length; i++) {
        //     list.add(i);
        // }
        // for(int i = 0; i < nums.length; i++) {
        //     if(list.contains(nums[i])) {
        //         list.remove(list.indexOf(nums[i]));
        //     }
        // }
        // return list;
    }
}