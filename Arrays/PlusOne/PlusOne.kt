class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var carry = -1
        var position = digits.size - 1
        while (carry != 0 && position >= 0) { 
            val digit = (digits[position] + 1)
            digits[position] = digit % 10
            carry = digit / 10
            position -= 1
        }
        
        return if (carry == 1) intArrayOf(1) + digits else digits
    }
}