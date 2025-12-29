function fourSum(nums: number[], target: number): number[][] {
  nums.sort((a, b) => a - b);
  // const result: number[][] = [];
  return [];
}

console.log("Problem 18:");
console.log(fourSum([1, 0, -1, 0, -2, 2], 0)); // [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
console.log(fourSum([2, 2, 2, 2, 2], 8)); // [[2,2,2,2]]
console.log(fourSum([0, 0, 0, 0], 0)); // [[0,0,0,0]] // [[0,0,0,0]]
console.log(fourSum([0, 0, 0, 0, 0], 0)); // [[0,0,0,0]]
console.log(fourSum([-3, -1, 0, 2, 4, 5], 2)); // [[-3,-1,2,4]]
