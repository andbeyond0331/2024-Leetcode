class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] answer = new int[nums1.length];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }
        for(int i = 0; i< n; i++) {
            list.add(nums2[i]);
        }
        list.sort(Comparator.naturalOrder());
        for(int i = 0; i< nums1.length; i++) {
            nums1[i] = list.get(i);
        }
        // int left = 0;
        // int right = 0;
        // for(int i = 0; i < nums1.length; i++) {
        //     for(int j = 0; j < nums1.length; j++) {
        //         System.out.print(answer[j] + " ");
        //     }
        //     System.out.println("right: " + right + ", left: " + left);
        //     if(right<n && left<m) {
        //         if(left>right) {
        //             answer[i] = nums2[right];
        //             right++;
        //         }else {
        //             answer[i] = nums1[left];
        //             left++;
        //         }
        //     }else if(right<n) {
        //         answer[i] = nums1[left];
        //         left++;
        //     }else if(left<m) {
        //         answer[i] = nums2[right];
        //         right++;
        //     }
        // }
        // for(int i = 0; i < nums1.length; i++) {
        //     nums1[i] = answer[i];
        // }
    }
}