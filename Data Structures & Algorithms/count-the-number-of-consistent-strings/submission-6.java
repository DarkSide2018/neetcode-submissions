class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedchars = new HashSet<>();

        for(char c: allowed.toCharArray()){
            allowedchars.add(c);
        }

        int count = 0;

        for(String w: words){

            boolean contains = true;

         for (char c : w.toCharArray()){

            if(!allowedchars.contains(c)){
                contains=false;
            }

         }
         if(contains) count++;
        }
        return count;
    }
}