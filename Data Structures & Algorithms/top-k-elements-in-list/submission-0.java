class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);

        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (e1, e2) -> Integer.compare(e2[1], e1[1])
        );
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            heap.offer(new int[]{e.getKey(), e.getValue()});
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = heap.poll()[0];
        }

        return res;
    }
}
