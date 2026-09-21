class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        val values:MutableList<Int> = mutableListOf()
        nums.forEach{
            if(values.contains(it)) return true;
            values.add(it)
        }
        return false;
    }
}
