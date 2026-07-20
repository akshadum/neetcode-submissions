class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE, left = 0;
        if (s.length() == 0)
            return 0;
        if (s.isBlank() || s.length() == 1)
            return 1;
        for (int right = 0; right < s.length(); right++) {
            char temp = s.charAt(right);

            if (map.containsKey(temp)) {
                left = Math.max(left, map.get(temp) + 1);
            }

            map.put(temp, right); 
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
