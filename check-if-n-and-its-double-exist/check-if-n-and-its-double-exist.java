class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean answer = false;
        outer:for(int i = 0; i < arr.length-1; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] * 2 == arr[j] || arr[j] * 2 == arr[i]) {
                    answer = true;
                    break outer;
                }
            }  
        }
        return answer;
    }
}