class Solution {
fun longestConsecutive(nums: IntArray): Int {

    if(nums.isEmpty()){
        return 0;
    }

    val numset:MutableSet<Int> = mutableSetOf<Int>()

    nums.forEach {
        numset.add(it)
    }
    var longestPath=0
    var currentNum = 0
    var currStreak=0;
    nums.forEach{
        if(!numset.contains(it-1)){
            currStreak = 1;
            currentNum=it
        }

        while(numset.contains(currentNum+1)){
            currentNum = currentNum+1
            currStreak++
        }
        longestPath = Math.max(longestPath,currStreak)
    }

    return longestPath
}
}
