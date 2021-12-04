class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        var level = 0
        var n = matrix.size - 1
        while (level < matrix.size / 2) { 
            for (index in level until n - level) { 
                var temp = matrix[level][index]
                matrix[level][index] = matrix[n - index][level]
                matrix[n - index][level] = matrix[n - level][n - index]
                matrix[n - level][n - index] = matrix[index][n - level]
                matrix[index][n - level] = temp
            }
            level++
        }
    }
}