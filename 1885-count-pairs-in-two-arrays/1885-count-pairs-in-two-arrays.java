import java.util.*;

class Solution {
    public long countPairs(int[] nums1, int[] nums2) {
        long answer = 0;
        int len = nums1.length;
        int[] ot = new int[len];
        // int[] to = new int[len];
        for(int i = 0; i < len; i++) {
            ot[i] = nums1[i] - nums2[i];
            // to[i] = nums2[i] - nums1[i];
        }
        Arrays.sort(ot);
        
        for(int i = 0; i < len; i++) {
            if(ot[i]>0) {
                answer+=len-i-1;
            }else {
                int left = i + 1;
                int right = len-1;
                while(left <= right) {
                    int mid = left + (right - left) / 2;
                    if(ot[i] + ot[mid]>0) {
                        right = mid - 1;
                        
                    } else {
                        left = mid + 1;
                    }
                }
                answer += len - left;
            }
        }
        // for(int i = 0; i < len-1; i++) {
        //     for(int j = i+1; j < len; j++) {
        //         if(ot[i]>to[j]) {
        //             answer++;
        //         }
        //     }
        // }
        return answer;
    }
}