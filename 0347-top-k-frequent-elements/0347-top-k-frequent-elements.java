public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: 빈도 계산
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: 최대 힙 사용하여 k개의 가장 빈번한 요소 찾기
        PriorityQueue<Map.Entry<Integer, Integer>> heap = 
            new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                    return e2.getValue() - e1.getValue();
                }
            });

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            heap.offer(entry);
        }

        // 결과를 저장할 리스트
        List<Integer> topKList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            topKList.add(heap.poll().getKey());
        }
        
        // 리스트를 배열로 변환
        int[] topK = new int[topKList.size()];
        for (int i = 0; i < topKList.size(); i++) {
            topK[i] = topKList.get(i);
        }
        
        return topK;
    }
}
