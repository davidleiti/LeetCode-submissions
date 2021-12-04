class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val rotations = k % nums.size
        reverse(nums, 0, nums.size - rotations - 1)
        reverse(nums, nums.size - rotations, nums.size - 1)
        reverse(nums, 0, nums.size - 1)
    }
    
    fun reverse(nums: IntArray, from: Int, to: Int) { 
        var start = from
        var end = to
        while (start < end) { 
            val temp = nums[start]
            nums[start] = nums[end]
            nums[end] = temp
            start++
            end--
        }
    }
}