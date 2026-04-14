import { describe, it, expect } from 'vitest';
import { threeSumClosest } from './P16ThreeSumClosest';

describe('P16 Three Sum Closest', () => {
  it('should return 2 for [-1,2,1,-4] with target 1', () => {
    expect(threeSumClosest([-1, 2, 1, -4], 1)).toBe(2);
  });

  it('should return 0 for [0,0,0] with target 1', () => {
    expect(threeSumClosest([0, 0, 0], 1)).toBe(0);
  });
});
