class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();
        StringBuilder buffer = new StringBuilder();
        for(String w: words){
            buffer.append(w);
            String reversed = buffer.reverse().toString();
            sb.append(reversed);
            sb.append(" ");
            buffer.setLength(0);    
        }
        return sb.toString().trim();
    }
}
