import java.util.*;

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int dec = 0;
        long answer = 0;
        for(int i = happiness.length-1; i>=0; i--) {
            if(dec == k) {
                break;
            }
            if(happiness[i]-dec >=0) {
                answer+=happiness[i]-dec;
            }else{
                answer+=0;
            }
            dec++;
        }
        return answer;
    }
}