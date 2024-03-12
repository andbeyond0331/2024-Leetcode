class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean flag = false;
        if (arr.length < 3) {
            return false;
        }
        for (int i = 1; i < arr.length; i++) {
            if (flag) {
                if (arr[i] >= arr[i-1]) {
                    return false;
                }
            } else {
                if(i == 1 && arr[i] <= arr[i-1]) {
                    return false;
                }
                if (arr[i] < arr[i-1]) {
                    flag = true;
                } else if (arr[i] == arr[i-1]) {
                    return false;
                }
            }
        }
        if(!flag) {
            return false;
        }
        return true;
    }
}