class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, zeroCount = 0;
        int[] ans = new int[n];
        int product = 1;
        boolean flag = false;

        for (int num : nums) {
            if (num != 0) {
                product *= num;
            } else {
                zeroCount++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                ans[i] = 0;
            } else if (zeroCount == 1) {
                ans[i] = (nums[i] == 0) ? product : 0;
            } else {
                ans[i] = product / nums[i];
            }
        }
        return ans;
    }
}
