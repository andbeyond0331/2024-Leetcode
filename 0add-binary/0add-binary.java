class Solution {
    public String addBinary(String a, String b) {
        int aLast = a.length()-1;
        int bLast = b.length()-1;
        int left = 0;
        String answer = "";
        while(aLast>=0 && bLast>=0) {
            int aNum = Integer.parseInt(a.substring(aLast, aLast+1));
            int bNum = Integer.parseInt(b.substring(bLast, bLast+1));
            int temp = aNum + bNum + left;
            if(temp == 0) {
                answer = "0" + answer;
            } else if(temp == 1) {
                answer = "1" + answer;
                left = 0;
            } else if(temp % 2 == 1){
                answer = "1" + answer;
                left = 1;
            } else if(temp % 2 == 0) {
                answer = "0" + answer;
                left = temp/2;
            }
            aLast--;
            bLast--;
        }
        while(aLast>=0) {
            int aNum = Integer.parseInt(a.substring(aLast, aLast+1));
            int temp = aNum + left;
            if(temp == 0) {
                answer = "0" + answer;
            } else if(temp == 1) {
                answer = "1" + answer;
                left = 0;
            } else if(temp % 2 == 1){
                answer = "1" + answer;
                left = 1;
            } else if(temp % 2 == 0) {
                answer = "0" + answer;
                left = temp/2;
            }
            aLast--;
        }
        while(bLast>=0) {
            int bNum = Integer.parseInt(b.substring(bLast, bLast+1));
            int temp = bNum + left;
            if(temp == 0) {
                answer = "0" + answer;
            } else if(temp == 1) {
                answer = "1" + answer;
                left = 0;
            } else if(temp % 2 == 1){
                answer = "1" + answer;
                left = 1;
            } else if(temp % 2 == 0) {
                answer = "0" + answer;
                left = temp/2;
            }
            bLast--;
        }
        // while(left>0) {
        //     if(left == 1) {
        //         answer = "1" + answer;
        //     }
        //     left--;
        // }
        if(left == 1) {
            answer = "1" + answer;
        }
        return answer;
        // long numA = 0;
        // long numB = 0;
        // int aTwo = 0;
        // int bTwo = 0;
        // String answer = "";
        // for(int i = a.length()-1; i >= 0; i--) {
        //     numA += Integer.parseInt(a.substring(i, i+1))*Math.pow(2, aTwo);
        //     aTwo++;
        // }
        // for(int i = b.length()-1; i >= 0; i--) {
        //     numB += Integer.parseInt(b.substring(i, i+1))*Math.pow(2, bTwo);
        //     bTwo++;
        // }
        // long sum = numA + numB;
        // int two = 0;
        // if(sum == 0) {
        //     return "0";
        // }
        // while(true) {
        //     if(Math.pow(2, two)>sum) {
        //         break;
        //     }
        //     two++;
        // }
        // two--;
        // while(two>=0) {
        //     if(Math.pow(2, two)<=sum) {
        //         sum-=Math.pow(2, two);
        //         answer += "1";
        //     } else {
        //         answer += "0";
        //     }
        //     two--;
        // }
        // return answer;
    }
}