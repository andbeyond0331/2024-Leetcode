class Solution {
    public void duplicateZeros(int[] arr) {
        int index = 0;
        
        int[] answer = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            // for(int j = 0; j < arr.length; j++) {
            //     System.out.print(answer[j] + " ");
            // }
            // System.out.println();
            if(index >= arr.length) {
                break;
            }
            if(arr[i] == 0) {
                answer[index] = 0;
                if(index < arr.length-1) {
                    answer[index+1] = 0;
                }
                index++;
            } else {
                answer[index] = arr[i];
            }
            index++;
        }
        for(int i = 0; i < answer.length; i++) {
            arr[i] = answer[i];
        }
        
    }
}