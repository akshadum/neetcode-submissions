class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char temp = t.charAt(i);
            map2.put(temp, map2.getOrDefault(temp, 0) + 1);
        }
        return map.equals(map2);
    }
}
