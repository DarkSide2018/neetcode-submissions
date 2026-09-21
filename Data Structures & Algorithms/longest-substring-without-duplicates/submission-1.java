class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length() == 0){
            return 0;
        }

        int [] charIndex = new int[256];

        for(int i=0; i<256; i++){
            charIndex[i] = -1;
        }

        int maxLength=0;

        int left=0;

        for(int right=0; right<s.length();right++){
            char currentChar=s.charAt(right);

            if(charIndex[currentChar] >= left){
                left = charIndex[currentChar] +1;
            }

            charIndex[currentChar] = right;

            int currentLength = right-left+1;

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
