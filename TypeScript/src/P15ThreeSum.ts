// 1. Sort the array
// 2. For each element nums[i]:
//    - Skip if it's a duplicate of the previous element
//    - Set left = i + 1, right = end
//    - While left < right:
//      - Calculate sum = nums[i] + nums[left] + nums[right]
//      - If sum == 0: save triplet, skip duplicates, move both pointers
//      - If sum < 0: move left pointer right
//      - If sum > 0: move right pointer left

function threeSum(nums: number[]): number[][] {
  nums.sort((a, b) => a - b);
  const result: number[][] = [];
  for (let i = 0; i < nums.length - 2; i++) {
    if (i > 0 && nums[i] === nums[i - 1]) continue;
    let left: number = i + 1;
    let right: number = nums.length - 1;
    while (left < right) {
      const sum: number = nums[i] + nums[left] + nums[right];
      if (sum === 0) {
        result.push([nums[i], nums[left], nums[right]]);

        while (left < right && nums[left] === nums[left + 1]) {
          left++;
        }
        while (left < right && nums[right] === nums[right - 1]) {
          right--;
        }
        left++;
        right--;
      } else if (sum < 0) {
        left++;
      } else {
        right--;
      }
    }
  }
  return result;
}

console.log("Problem 13:");
console.log(threeSum([-1, 0, 1, 2, -1, -4])); // [[-1,-1,2],[-1,0,1]]
console.log(threeSum([]));
console.log(threeSum([0]));
