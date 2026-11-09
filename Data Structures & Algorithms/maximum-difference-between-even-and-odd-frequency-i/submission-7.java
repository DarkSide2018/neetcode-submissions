class Solution {
    public int maxDifference(String s) {

        Map<Character,Integer> countValues = new HashMap<>();
        
        char [] chars = s.toCharArray();

        int oddFrequency = 0;
        int evenFrequency=Integer.MAX_VALUE;

        for(char c: chars){
            countValues.put(c,countValues.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character,Integer> entry : countValues.entrySet()){
            if(entry.getValue()%2 == 0){
                 evenFrequency = Math.min(evenFrequency,entry.getValue());
                
            }else{
                 oddFrequency = Math.max(oddFrequency,entry.getValue());
            }

        }
        return oddFrequency- evenFrequency;
    }
}