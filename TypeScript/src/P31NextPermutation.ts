export {};

/**
 Do not return anything, modify nums in-place instead.
 */
function nextPermutation(nums: number[]): void {
  let i = nums.length - 2;
  while (i >= 0 && nums[i] >= nums[i + 1]) {
    i--;
  }
  if (i >= 0) {
    let j = nums.length - 1;
    while (nums[j] <= nums[i]) {
      j--;
    }
    [nums[i], nums[j]] = [nums[j], nums[i]];
  }
  let left = i + 1;
  let right = nums.length - 1;
  while (left < right) {
    [nums[left], nums[right]] = [nums[right], nums[left]];
    left++;
    right--;
  }
}

console.log("Problem 31: Next Permutation");
const arr1 = [1, 2, 3];
nextPermutation(arr1);
console.log(arr1); // [1,3,2]

const arr2 = [3, 2, 1];
nextPermutation(arr2);
console.log(arr2); // [1,2,3]

const arr3 = [1, 1, 5];
nextPermutation(arr3);
console.log(arr3); // [1,5,1]

const arr4 = [1];
nextPermutation(arr4);
console.log(arr4); // [1]

const arr5 = [1, 3, 2];
nextPermutation(arr5);
console.log(arr5); // [2,1,3]

const arr6 = [2, 3, 1];
nextPermutation(arr6);
console.log(arr6); // [3,1,2]
