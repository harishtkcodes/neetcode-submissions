class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        final Map<Integer, List<String>> group = new HashMap<>();

        for (String s : strs) {
            int key = Arrays.hashCode(getKey(s));
            group.putIfAbsent(key, new ArrayList<>());
            group.get(key).add(s);
        }

        return new ArrayList<>(group.values());
    }

    private int[] getKey(String s) {
        int[] key = new int[26];
        for (char c : s.toCharArray()) key[c - 'a']++;
        return key;
    } 
}
