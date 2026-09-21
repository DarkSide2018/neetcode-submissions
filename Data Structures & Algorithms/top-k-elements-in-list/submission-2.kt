class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        if(nums.isEmpty() || k==0) return intArrayOf(0)

        val freqMap:MutableMap<Int,Int> = mutableMapOf()

        nums.forEach{
        freqMap[it] = freqMap.getOrDefault(it,0)+1
        }
        return freqMap.map { entry ->  entry}
        .toList()
        .sortedByDescending{ entry -> entry.value }
        .dropLast(freqMap.size-k)
        .map{it.key}
        .toIntArray()
    }
}
