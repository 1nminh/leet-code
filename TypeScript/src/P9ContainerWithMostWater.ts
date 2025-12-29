const maxArea = (height: number[]): number => {
  let left: number = 0;
  let right: number = height.length - 1;
  let maxArea: number = 0;

  while (left < right) {
    const area = Math.min(height[left], height[right]) * (right - left);
    maxArea = Math.max(area, maxArea);
    if (height[left] < height[right]) {
      left++;
    } else {
      right--;
    }
  }
  
  return maxArea;
};

console.log("Problem 11:");
console.log(maxArea([1, 8, 6, 2, 5, 4, 8, 3, 7] as number[])); // 49
console.log(maxArea([1, 1] as number[]));                      // 1
console.log(maxArea([4, 3, 2, 1, 4] as number[]));             // 16
console.log(maxArea([1, 2, 1] as number[]));                   // 2


        



