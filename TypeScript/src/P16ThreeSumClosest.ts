function threeSumClosest(nums: number[], target: number): number {
  nums.sort((a, b) => a - b);
  let closestSum: number = nums[0] + nums[1] + nums[2];
  for (let i = 0; i < nums.length - 2; i++) {
    let left: number = i + 1;
    let right: number = nums.length - 1;
    while (left < right) {
      const currentSum: number = nums[i] + nums[left] + nums[right];
      if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
        closestSum = currentSum;
      }
      if (currentSum < target) {
        left++;
      } else if (currentSum > target) {
        right--;
      } else {
        return currentSum;
      }
    }
  }
  return closestSum;
}

console.log("Problem 14:");
console.log(threeSumClosest([-1, 2, 1, -4], 1)); // 2
console.log(threeSumClosest([0, 0, 0], 1)); // 0
console.log(threeSumClosest([1, 1, 1, 0], -100)); // 2
console.log(threeSumClosest([1, 2, 5, 10, 11], 12)); // 13
console.log(threeSumClosest([0, 2, 1, -3], 1)); // 0
console.log(threeSumClosest([1, 1, 1, 1], 0)); // 3
console.log(threeSumClosest([1, 6, 9, 14, 16, 70], 81)); // 80
console.log(threeSumClosest([4, 0, 5, -5, 3, 3, 0, -4, -5], -2)); // -2
console.log(threeSumClosest([0, 1, 2], 3)); // 3
