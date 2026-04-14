import { describe, it, expect } from 'vitest';
import { divide } from './P29DivideTwoIntegers';

describe('P29 Divide Two Integers', () => {
  it('should return 3 for 10 / 3', () => {
    expect(divide(10, 3)).toBe(3);
  });

  it('should return -2 for 7 / -3', () => {
    expect(divide(7, -3)).toBe(-2);
  });

  it('should return 0 for 0 / 1', () => {
    expect(divide(0, 1)).toBe(0);
  });

  it('should return 2147483647 for -2147483648 / -1 (overflow clamped)', () => {
    expect(divide(-2147483648, -1)).toBe(2147483647);
  });
});
