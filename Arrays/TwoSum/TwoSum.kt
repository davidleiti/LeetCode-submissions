class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val complements: MutableMap<Int, Int> = HashMap()
        for (index in nums.indices) {
            val complementIndex = complements[target - nums[index]]
            if (complementIndex != null) { 
                return intArrayOf(complementIndex, index)
            } else { 
                complements[nums[index]] = index
            }
        }
        
        return intArrayOf()
    }
}