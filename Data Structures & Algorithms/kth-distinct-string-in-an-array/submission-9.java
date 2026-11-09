class Solution {
    
    public String kthDistinct(String[] arr, int k) {

        Map<String,Integer> valueCount = new LinkedHashMap<String,Integer>();

        int count = 0;
        for(String s: arr){

            valueCount.put(s,valueCount.getOrDefault(s,0)+1);

        }
        for(Map.Entry<String,Integer> entry: valueCount.entrySet()){
            if(entry.getValue() == 1){
                count++;
                if(count == k){
                    return entry.getKey();
                }
            }
        }

        return "";
    }
}