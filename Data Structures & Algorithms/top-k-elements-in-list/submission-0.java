class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> frequencyMap = new HashMap();

        for(int num:nums){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap 
        = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());

        for(Map.Entry<Integer,Integer> entry:frequencyMap.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        int[] result = new int[k];

        for (int j=0; j<k; j++){
            result[j]=minHeap.poll().getKey();
        }
        return result;
    }
}
