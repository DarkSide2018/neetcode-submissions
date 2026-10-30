class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        char [] rArr = ransomNote.toCharArray();
        char [] mArr = magazine.toCharArray();

        int count = 0;
        for(int i=0; i<rArr.length; i++){

            for (int j=0; j<mArr.length;j++){
                if(rArr[i] == mArr[j]){
                    count++;
                    mArr[j] = '#';
                    break;
                }
            }

            if(count == rArr.length){
                return true;
            }
        }
        return false;
    }
}