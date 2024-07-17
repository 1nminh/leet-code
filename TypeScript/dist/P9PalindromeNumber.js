"use strict";
console.log("9. Palindrome Number");
console.log("Case 1: ", isPalindrome(121));
console.log("Case 2: ", isPalindrome(-121));
console.log("Case 3: ", isPalindrome(10));
const newArr = [1, "2"];
function isPalindrome(x) {
    if (x < 0) {
        return false;
    }
    let str = x.toString();
    let revertStr = str.split("").reverse().join("");
    if (str == revertStr) {
        return true;
    }
    return false;
}
//# sourceMappingURL=P9PalindromeNumber.js.map