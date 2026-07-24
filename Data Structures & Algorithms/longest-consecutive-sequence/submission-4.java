class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        TreeSet<Integer> set = new TreeSet<>();
		int count = 1, maxCount = 1;
		for(int i:nums) set.add(i);
		List<Integer> list = new ArrayList<>(set);

		for(int i=1; i<list.size(); i++) {
			if(list.get(i) == list.get(i-1) + 1){
				count++;
			}
			else count = 1;

			maxCount = Math.max(maxCount, count);
		}
        return maxCount;
        
    }
}
