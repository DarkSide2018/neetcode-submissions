class Solution {
    public int minOperations(String s) {

        char[] chars = s.toCharArray();
        int count0=0;
        int count1=0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c != (i%2 == 0 ? '0' : '1')) count0++;
            if(c != (i%2 == 0 ? '1' : '0')) count1++;
        }
        return Math.min(count0,count1);
    }
}