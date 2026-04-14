// Time: O(n), Space: O(1) // Approach: Two pointers from both ends
export function searchRange(nums: number[], target: number): number[] {
  let left = 0;
  let right = nums.length - 1;
  let firstPos = -1;
  let lastPos = -1;

  while (left <= right) {
    if (firstPos === -1 && nums[left] === target) {
      firstPos = left;
    }
    if (lastPos === -1 && nums[right] === target) {
      lastPos = right;
    }
    if (firstPos === -1) left++;
    if (lastPos === -1) right--;

    if (firstPos !== -1 && lastPos !== -1) return [firstPos, lastPos];
  }
  return [firstPos, lastPos];
}
