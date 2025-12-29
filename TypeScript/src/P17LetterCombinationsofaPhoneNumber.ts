function letterCombinations(digits: string): string[] {
  if (digits.length === 0) return [];

  const digitToChars: { [key: string]: string[] } = {
    "2": ["a", "b", "c"],
    "3": ["d", "e", "f"],
    "4": ["g", "h", "i"],
    "5": ["j", "k", "l"],
    "6": ["m", "n", "o"],
    "7": ["p", "q", "r", "s"],
    "8": ["t", "u", "v"],
    "9": ["w", "x", "y", "z"],
  };

  let result: string[] = [""];

  for (const digit of digits) {
    const letters = digitToChars[digit];
    console.log('digit :>> ', digit);
    console.log('letters :>> ', letters);
    const newResult: string[] = [];

    for (const combo of result) {
      for (const letter of letters) {
        newResult.push(combo + letter);
      }
    }

    result = newResult;
  }

  return result;
}

console.log("Problem 17:");
console.log(letterCombinations("234")); // ["adg","adh","adi","aeg","aeh","aei","afg","afh","afi","bdg","bdh","bdi","beg","beh","bei","bfg","bfh","bfi","cdg","cdh","cdi","ceg","ceh","cei","cfg","cfh","cfi"]
console.log(letterCombinations("23")); // ["ad","ae","af","bd","be","bf","cd","ce","cf"]
console.log(letterCombinations("")); // []
console.log(letterCombinations("2")); // ["a","b","c"]
console.log(letterCombinations("7")); // ["p","q","r","s"]
console.log(letterCombinations("9")); // ["w","x","y","z"]
