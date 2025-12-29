export {};

function countAndSay(n: number): string {
  if (n === 1) return "1";

  const prev = countAndSay(n - 1);
  let result = "";
  let count = 1;

  for (let i = 1; i < prev.length; i++) {
    if (prev[i] === prev[i - 1]) {
      count++;
    } else {
      result += count.toString() + prev[i - 1];
      count = 1;
    }
  }
  result += count.toString() + prev[prev.length - 1];

  return result;
}

console.log("Problem 37: Count and Say");

const n1 = 1;
console.log(countAndSay(n1)); // "1"

const n2 = 4;
console.log(countAndSay(n2)); // "1211"

const n3 = 5;
console.log(countAndSay(n3)); // "111221"

const n4 = 6;
console.log(countAndSay(n4)); // "312211"

const n5 = 7;
console.log(countAndSay(n5)); // "13112221"

const n6 = 8;
console.log(countAndSay(n6)); // "1113213211"
