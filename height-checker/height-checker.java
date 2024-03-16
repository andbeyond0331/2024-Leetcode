class Solution {
    public int heightChecker(int[] heights) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < heights.length; i++) {
            list.add(heights[i]);
        }
        list.sort(Comparator.naturalOrder());
        for(int i = 0; i < heights.length; i++) {
            if(list.get(i)!=heights[i]) {
                count++;
            }
        }
        return count;
    }
}