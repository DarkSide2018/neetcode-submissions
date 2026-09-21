class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.isEmpty() || t.isEmpty()){
            return false;
        }

        if(s.length != t.length) return false
        
        val sArray = s.toCharArray().sorted()
        val tArray = t.toCharArray().sorted()

        sArray.forEachIndexed{index, value->
            if(tArray[index] != value){
                return false;
            }
        }
        return true;
    }
}
