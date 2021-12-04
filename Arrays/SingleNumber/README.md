# Single Number

Given a non-empty array of integers `nums`, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

### Example 1:
```
Input: nums = [2,2,1]
Output: 1
```

### Example 2:
```
Input: nums = [4,1,2,1,2]
Output: 4
```

### Example 3:
```
Input: nums = [1]
Output: 1
```

### Constraints:

- `1 <= nums.length <= 3 * 104`
- `-3 * 104 <= nums[i] <= 3 * 104`
- Each element in the array appears twice except for one element which appears only once.

## Solution
 
As simple as the solution is, as much time and thought went into it from my side until I finally read the discussions.
The main idea is that of using the XOR operator for the following two reasons:
- A XOR A = 0
- The XOR operator is commutative

By this logic, applying XOR on each element of the array sequentially, the end result will be the number itself that didn't have a pair.

Takeaway: Think more in terms of bitwise operations

- Time complexity: O(n)
- Space complexity: O(1)