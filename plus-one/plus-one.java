class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        boolean flag = false;
        for(int i = digits.length-1; i >= 0; i--) {
            if(i!=0) {
                if(digits[i]>9) {
                    digits[i] = digits[i]-10;
                    digits[i-1]++;
                }
            }else {
                if(digits[i]>9) {
                    digits[i] = digits[i]-10;
                    flag = true;
                }
            }
        }
        int[] answer = new int[flag?digits.length+1:digits.length];
        if(answer.length==digits.length) {
            for(int i = 0; i< answer.length; i++) {
                answer[i] = digits[i];
            }
        }else{
            answer[0] = 1;
            for(int i = 1; i < answer.length; i++) {
                answer[i] = digits[i-1];
            }
        }
//         String result = "";
//         for(int i = 0; i < digits.length; i++) {
//             result += String.valueOf(digits[i]);
//         }
//         // String num = String.valueOf(Integer.parseInt(result)+1);
        
//         int[] answer = new int[digits[digits.length-1]==9?digits.length+1:digits.length];
//         for(int i = answer.length-1; i >= 0; i--) {
            
//         }
//         // for(int i = 0; i < answer.length; i++) {
//         //     answer[i] = Integer.parseInt(num.substring(i, i+1));
//         // }
        return answer;
    }
}