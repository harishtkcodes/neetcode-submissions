class Solution {
    public boolean hasDuplicate(int[] nums) {
        final Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }

        return false;
    }
}