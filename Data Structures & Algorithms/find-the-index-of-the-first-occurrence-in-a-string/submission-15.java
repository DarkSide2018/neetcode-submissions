class Solution {
    public int strStr(String haystack, String needle) {

        int haystackLen = haystack.length();

        int needleLen = needle.length();

        if(needleLen>haystackLen) return -1;


        for(int i=0; i<=haystackLen - needleLen;i++){
            int j=0;

            while(j<needleLen && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
            }
            if(j==needleLen) return i;
        }
        return -1;
    }
}