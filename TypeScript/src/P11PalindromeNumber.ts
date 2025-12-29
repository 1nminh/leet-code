console.log("9. Palindrome Number");
console.log("Case 1: ", isPalindrome(121));
console.log("Case 2: ", isPalindrome(-121));
console.log("Case 3: ", isPalindrome(10));

// const newArr: (string | number)[] = [1, "2"];
function isPalindrome(x: number): boolean {
  if (x < 0) {
    return false;
  }
  const str = x.toString();
  const revertStr: string = str.split("").reverse().join("");
  if (str == revertStr) {
    return true;
  }
  return false;
}
