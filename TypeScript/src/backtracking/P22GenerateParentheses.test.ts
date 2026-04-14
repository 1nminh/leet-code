import { describe, it, expect } from 'vitest';
import { generateParenthesis } from './P22GenerateParentheses';

describe('P22 Generate Parentheses', () => {
  it('should return all valid combinations for n=3', () => {
    expect(generateParenthesis(3)).toEqual([
      '((()))', '(()())', '(())()', '()(())', '()()()',
    ]);
  });

  it('should return ["()"] for n=1', () => {
    expect(generateParenthesis(1)).toEqual(['()']);
  });

  it('should return ["(())","()()"] for n=2', () => {
    expect(generateParenthesis(2)).toEqual(['(())', '()()']);
  });
});
