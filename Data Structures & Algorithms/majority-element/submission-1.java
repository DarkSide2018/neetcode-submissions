class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer,Integer> count = new HashMap<Integer,Integer>();

        for(int n:nums){
            count.put(n,count.getOrDefault(n,1)+1);
        }

        return count.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }
}