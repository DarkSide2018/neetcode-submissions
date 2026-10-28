class Solution {
    public int findLucky(int[] arr) {
        if(arr == null || arr.length == 0){
            return -1;
        }
        Map<Integer,Integer> freq = new HashMap<>();

        for(int x: arr){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }

        int answer = -1;

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            int value = entry.getKey();
            int count = entry.getValue();

            if(value == count){
                answer = Math.max(answer,value);
            }
        }

        return answer;
    }
}