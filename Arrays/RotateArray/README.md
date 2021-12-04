# Rotate Array

Given an array, rotate the array to the right by `k` steps, where `k` is non-negative.

### Example 1:
```
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
```

### Example 2:
```
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
``` 

### Constraints:
- 1 <= nums.length <= 105
- -231 <= nums[i] <= 231 - 1
- 0 <= k <= 105
 
### Follow up:
- Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
- Could you do it in-place with O(1) extra space?

## Solution
The most efficient approach to this problem is to reverse parts of the array based on the number of rotations `k` and then the array itself.
This way, the result will be the array as if it were rotated by `k` times. A relevant detail is to consider `n % k` instead of `k`, as it may be greater than the
number of elements in the array, in which case a lot of unnecessary rotations would be made.

- Time complexity: O(n)
- Space complexity: O(1)