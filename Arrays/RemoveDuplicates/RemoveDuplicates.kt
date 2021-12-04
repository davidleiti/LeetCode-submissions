class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var progressIndex = 0
        for (index in 1..nums.lastIndex) { 
            if (nums[index] != nums[progressIndex]) { 
                progressIndex++
                nums[progressIndex] = nums[index]
            }
        }
        
        return progressIndex + 1
    }
}