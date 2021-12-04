class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var zero = 0
        var pos = 0
        while (pos < nums.size) { 
            if (nums[pos] != 0) { 
                val temp = nums[pos]
                nums[pos] = nums[zero]
                nums[zero] = temp
                zero++
            }
            
            pos++
        }
    }
}