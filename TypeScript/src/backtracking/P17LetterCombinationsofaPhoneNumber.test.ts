import { describe, it, expect } from 'vitest';
import { letterCombinations } from './P17LetterCombinationsofaPhoneNumber';

describe('P17 Letter Combinations of a Phone Number', () => {
  it('should return all combinations for "23"', () => {
    expect(letterCombinations('23')).toEqual([
      'ad', 'ae', 'af', 'bd', 'be', 'bf', 'cd', 'ce', 'cf',
    ]);
  });

  it('should return [] for empty string', () => {
    expect(letterCombinations('')).toEqual([]);
  });

  it('should return ["a","b","c"] for "2"', () => {
    expect(letterCombinations('2')).toEqual(['a', 'b', 'c']);
  });
});
