import { describe, it, expect } from 'vitest';
import { intToRoman } from './P12IntegerToRoman';

describe('P12 Integer to Roman', () => {
  it('should return "III" for 3', () => {
    expect(intToRoman(3)).toBe('III');
  });

  it('should return "LVIII" for 58', () => {
    expect(intToRoman(58)).toBe('LVIII');
  });

  it('should return "MCMXCIV" for 1994', () => {
    expect(intToRoman(1994)).toBe('MCMXCIV');
  });
});
