import { describe, it, expect } from 'vitest';
import { countAndSay } from './P38CountAndSay';

describe('P38 Count and Say', () => {
  it('should return "1" for n=1', () => {
    expect(countAndSay(1)).toBe('1');
  });

  it('should return "1211" for n=4', () => {
    expect(countAndSay(4)).toBe('1211');
  });

  it('should return "111221" for n=5', () => {
    expect(countAndSay(5)).toBe('111221');
  });
});
