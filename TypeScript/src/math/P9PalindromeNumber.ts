// Time: O(log n), Space: O(log n) // Approach: String reversal comparison
export function isPalindrome(x: number): boolean {
  if (x < 0) {
    return false;
  }
  const str = x.toString();
  const revertStr = str.split("").reverse().join("");
  return str === revertStr;
}
