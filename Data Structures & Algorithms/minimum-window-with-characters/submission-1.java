class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length())
            return "";
        int n = s.length();
        String ans = "";
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                if (containsAll(sub, t)) {
                    if (minLen > sub.length()) {
                        minLen = sub.length();
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }
    public boolean containsAll(String sub, String t) {
        int[] freq = new int[128];

        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        for (char c : sub.toCharArray()) {
            if (freq[c] > 0) {
                freq[c]--;
            }
        }

        for (char c : t.toCharArray()) {
            if (freq[c] > 0)
                return false;
        }
        return true;
    }
}
