// Time: O(4^n / sqrt(n)), Space: O(4^n / sqrt(n)) // Approach: Backtracking with open/close count
export function generateParenthesis(n: number): string[] {
  const results: string[] = [];
  function backtrack(
    current_string: string,
    open_count: number,
    close_count: number
  ): void {
    if (current_string.length === 2 * n) {
      results.push(current_string);
      return;
    }

    if (open_count < n) {
      backtrack(current_string + "(", open_count + 1, close_count);
    }

    if (close_count < open_count) {
      backtrack(current_string + ")", open_count, close_count + 1);
    }
  }
  backtrack("", 0, 0);
  return results;
}
