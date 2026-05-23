class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        final Map<Integer, List<String>> group = new HashMap<>();

        int key;
        for (String s : strs) {
            key = Arrays.hashCode(getKey(s));
            group.computeIfAbsent(key, k -> new ArrayList());
            group.get(key).add(s);
        }

        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<Integer, List<String>> e : group.entrySet()) {
            result.add(e.getValue());
        }

        return result;
    }

    private int[] getKey(String s) {
        int[] key = new int[26];
        for (char c : s.toCharArray()) key[c - 'a']++;
        return key;
    } 
}
