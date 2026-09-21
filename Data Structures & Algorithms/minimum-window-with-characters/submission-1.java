class Solution {
    public String minWindow(String s, String t) {
        if(s==null || t==null || s.length() == 0 || t.length() == 0){
            return "";
        }

        Map<Character, Integer> targetMap = new HashMap<>();

        for(char c: t.toCharArray()){
            targetMap.put(c, targetMap.getOrDefault(c,0)+1);
        }

        Map<Character, Integer> windowMap = new HashMap<>();

        int required = targetMap.size();

        int formed =0;

        int left=0;

        int minLen= Integer.MAX_VALUE;

        int minLeft=0;

        for(int right=0; right<s.length(); right++){
            char rightChar = s.charAt(right);
            windowMap.put(rightChar,windowMap.getOrDefault(rightChar,0)+1);
            if(targetMap.containsKey(rightChar) &&
            windowMap.get(rightChar).intValue() == targetMap.get(rightChar).intValue()){
                formed++;
            }

            while(formed == required && left<=right){
                int currentLen=right-left+1;
                if(currentLen<minLen){
                    minLen = currentLen;
                    minLeft=left;
                }

                char leftChar = s.charAt(left);

                windowMap.put(leftChar,windowMap.get(leftChar)-1);

                if(targetMap.containsKey(leftChar) &&
                windowMap.get(leftChar).intValue()<targetMap.get(leftChar).intValue()){
                    formed--;
                }
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE ? "" : s.substring(minLeft,minLeft+minLen);
    }
}
