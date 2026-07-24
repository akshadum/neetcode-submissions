class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1, maxArea = Integer.MIN_VALUE, currArea = 0;

        while (left < right) {
            if (heights[left] < heights[right]) {
                currArea = heights[left] * (right - left);
                left++;
            } else {
                currArea = heights[right] * (right - left);
                right--;
            }
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }
}
