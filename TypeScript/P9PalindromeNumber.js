console.log("9. Palindrome Number");
console.log("Case 1: ", isPalindrome(121));
console.log("Case 2: ", isPalindrome(-121));
console.log("Case 3: ", isPalindrome(10));
var newArr = [1, "2"];
function isPalindrome(x) {
    if (x < 0) {
        return false;
    }
    var str = x.toString();
    var revertStr = str.split("").reverse().join("");
    if (str == revertStr)
        return true;
    return false;
}
