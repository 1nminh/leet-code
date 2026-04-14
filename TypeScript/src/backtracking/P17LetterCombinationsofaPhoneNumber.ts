// Time: O(4^n), Space: O(4^n) // Approach: Iterative combination building
export function letterCombinations(digits: string): string[] {
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
