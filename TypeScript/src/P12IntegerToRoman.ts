const intToRoman = (num: number): string => {
  const valueSymbols: [number, string][] = [
    [1000, "M"],
    [900, "CM"],
    [500, "D"],
    [400, "CD"],
    [100, "C"],
    [90, "XC"],
    [50, "L"],
    [40, "XL"],
    [10, "X"],
    [9, "IX"],
    [5, "V"],
    [4, "IV"],
    [1, "I"],
  ];

  let roman: string = "";
  for (const [value, symbol] of valueSymbols) {
    while (num >= value) {
      roman += symbol;
      num -= value;
    }
  }

  return roman;
}

console.log("Problem 12:");
console.log(intToRoman(3));   // "III"
console.log(intToRoman(4));   // "IV"
console.log(intToRoman(9));   // "IX"
console.log(intToRoman(58));  // "LVIII"
console.log(intToRoman(1994)); // "MCMXCIV"

