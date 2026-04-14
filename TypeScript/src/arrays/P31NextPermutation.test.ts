import { describe, it, expect } from 'vitest';
import { nextPermutation } from './P31NextPermutation';

describe('P31 Next Permutation', () => {
  it('should mutate [1,2,3] to [1,3,2]', () => {
    const nums = [1, 2, 3];
    nextPermutation(nums);
    expect(nums).toEqual([1, 3, 2]);
  });

  it('should mutate [3,2,1] to [1,2,3]', () => {
    const nums = [3, 2, 1];
    nextPermutation(nums);
    expect(nums).toEqual([1, 2, 3]);
  });

  it('should mutate [1,1,5] to [1,5,1]', () => {
    const nums = [1, 1, 5];
    nextPermutation(nums);
    expect(nums).toEqual([1, 5, 1]);
  });
});
