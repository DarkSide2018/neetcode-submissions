class Solution {


    public int longestPalindrome(String s) {

        Map<Character,Integer> countValues = new HashMap();

        for(Character c: s.toCharArray()){
            countValues.put(c,countValues.getOrDefault(c,0)+1);
        }
        int sum =0;
        boolean hasOdd = false;
        for(int count: countValues.values()){
            sum += (count/2) * 2;

            if(count%2 == 1) hasOdd = true;
        }
        

        if(hasOdd){
            return sum+1;
        }else{
            return sum;
        }
    }
}