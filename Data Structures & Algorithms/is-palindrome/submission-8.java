class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length()-1;

        while(left<=right){

            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }

            if(s.toLowerCase().charAt(left) != s.toLowerCase().charAt(right)){
                return false;
            }

             left++;
             right--;
            
        }
        return true;
    }
}
