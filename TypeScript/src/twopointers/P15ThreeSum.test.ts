import { describe, it, expect } from 'vitest';
import { threeSum } from './P15ThreeSum';

describe('P15 Three Sum', () => {
  it('should return [[-1,-1,2],[-1,0,1]] for [-1,0,1,2,-1,-4]', () => {
    expect(threeSum([-1, 0, 1, 2, -1, -4])).toEqual([[-1, -1, 2], [-1, 0, 1]]);
  });

  it('should return [] for empty array', () => {
    expect(threeSum([])).toEqual([]);
  });

  it('should return [] for [0]', () => {
    expect(threeSum([0])).toEqual([]);
  });
});
