class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> grouped = new HashMap<>();
        List<List<String>> mainResult = new ArrayList<>();
        for (String word : strs) {
            Map<Character, Integer> freq = getFrequency(word);
            grouped.computeIfAbsent(freq, k -> new ArrayList<>()).add(word);
        }

        mainResult.addAll(grouped.values());
        return mainResult;
    }

    public static Map<Character, Integer> getFrequency(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char temp : str.toCharArray()) freq.put(temp, freq.getOrDefault(temp, 0) + 1);
        return freq;
    }
}
