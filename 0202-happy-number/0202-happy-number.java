class Solution {
    public boolean isHappy(int n) {
        boolean flag = true;
        Set<Integer> set = new HashSet<>();
        while(n!=1) {
            if(set.contains(n)) {
                flag = false;
                break;
            }
            set.add(n);
            int num = 0;
            String s = String.valueOf(n);
            for(int i = 0;i < s.length(); i++) {
                num+= Math.pow(Integer.parseInt(s.substring(i, i+1)), 2);
            }
            n = num;
        }
        return flag;
        
    }
}

// 1
// happy
// 2
// un
// 3
// un
// 4
// 