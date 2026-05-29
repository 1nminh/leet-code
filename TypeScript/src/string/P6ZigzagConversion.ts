export function convert(s: string, numRows: number): string {
  if (numRows <= 1 || s.length <= numRows) return s;
  let currentRow: number = 0;
  let direction: number = 1;
  const breakDown: string[] = Array(numRows).fill("");

  for (const char of s) {
    breakDown[currentRow] += char;
    if (currentRow === 0) direction = 1;
    else if (currentRow === numRows - 1) direction = -1;
    currentRow += direction;
  }

  let result: string = "";
  for (let i = 0; i < breakDown.length; i++) {
    result = result + breakDown[i];
  }

  return result;
}
