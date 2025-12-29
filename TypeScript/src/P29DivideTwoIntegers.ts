function divide(dividend: number, divisor: number): number {
  if (dividend === 0) return 0;
  if (dividend === -2147483648 && divisor === -1) return 2147483647;

  const isNegative = (dividend < 0) !== (divisor < 0);
  let absDividend = Math.abs(dividend);
  const absDivisor = Math.abs(divisor);
  let quotient = 0;

  while (absDividend >= absDivisor) {
    let tempDivisor = absDivisor;
    let multiple = 1;

    while (absDividend >= (tempDivisor << 1)) {
      tempDivisor <<= 1;
      multiple <<= 1;
    }

    absDividend -= tempDivisor;
    quotient += multiple;
  }

  return isNegative ? -quotient : quotient;
};

console.log("Problem 29: Divide Two Integers");
console.log(divide(10, 3)); // 3
console.log(divide(7, -3)); // -2
console.log(divide(0, 1)); // 0
console.log(divide(1, 1)); // 1
console.log(divide(-2147483648, -1)); // 2147483647



