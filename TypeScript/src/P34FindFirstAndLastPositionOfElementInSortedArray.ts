export {};


// function searchRange(nums: number[], target: number): number[] {
//   function findPosition(isFirst: boolean): number {
//     let left = 0;
//     let right = nums.length - 1;
//     let position = -1;

//     while (left <= right) {
//       const mid = Math.floor((left + right) / 2);
//       if (nums[mid] === target) {
//         position = mid;
//         if (isFirst) {
//           right = mid - 1; // Continue searching in the left half
//         } else {
//           left = mid + 1; // Continue searching in the right half
//         }
//       } else if (nums[mid] < target) {
//         left = mid + 1;
//       } else {
//         right = mid - 1;
//       }
//     }
//     return position;
//   }

//   const firstPos = findPosition(true);
//   const lastPos = findPosition(false);
//   return [firstPos, lastPos];
// }

function searchRange(nums: number[], target: number): number[] {
  let left = 0;
  let right = nums.length - 1;
  let firstPos = -1;
  let lastPos = -1;

  while (left <= right) {
    if (firstPos == -1 && nums[left] == target) {
      firstPos = left;
    }
    if (lastPos == -1 && nums[right] == target) {
      lastPos = right;
    }
    if (firstPos == -1) left++;
    if (lastPos == -1) right--;

    if (firstPos != -1 && lastPos != -1) return [firstPos, lastPos];
  }
  return [firstPos, lastPos];
}

console.log(
  "Problem 34: Find First and Last Position of Element in Sorted Array"
);

const arr1 = [5, 7, 7, 8, 8, 10];
console.log(searchRange(arr1, 8)); // [3,4]

const arr2 = [5, 7, 7, 8, 8, 10];
console.log(searchRange(arr2, 6)); // [-1,-1]

const arr3: number[] = [];
console.log(searchRange(arr3, 0)); // [-1,-1]

const arr4 = [1];
console.log(searchRange(arr4, 1)); // [0,0]

const arr5 = [2, 2];
console.log(searchRange(arr5, 2)); // [0,1]

const arr6 = [1, 2, 3];
console.log(searchRange(arr6, 1)); // [0,0]

const arr7 = [1];
console.log(searchRange(arr7, 1)); // [0,0]