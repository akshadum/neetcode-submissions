class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int max = 0, left = 0;

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            while(set.contains(current)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            max = Math.max(max, i - left +1);
        }
        return max;
    }
}
