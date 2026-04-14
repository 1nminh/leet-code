# LeetCode Solutions

Solutions in Java and TypeScript, organized by topic.

## Progress

| #  | Problem                                              | Difficulty | Topic           | Java | TypeScript |
|----|------------------------------------------------------|------------|-----------------|------|------------|
| 1  | Two Sum                                              | Easy       | Arrays          | Done |            |
| 2  | Add Two Numbers                                      | Medium     | Linked List     | Done |            |
| 3  | Longest Substring Without Repeating Characters       | Medium     | Sliding Window  | Done |            |
| 4  | Median of Two Sorted Arrays                          | Hard       | Arrays          | Done |            |
| 5  | Longest Palindromic Substring                        | Medium     | String          | Done |            |
| 6  | Zigzag Conversion                                    | Medium     | String          | Done |            |
| 7  | Reverse Integer                                      | Medium     | Math            | Done |            |
| 8  | String to Integer (atoi)                             | Medium     | String          | Done |            |
| 9  | Palindrome Number                                    | Easy       | Math            | Done | Done       |
| 10 | Regular Expression Matching                          | Hard       | DP              | Done |            |
| 11 | Container With Most Water                            | Medium     | Two Pointers    | Done | Done       |
| 12 | Integer to Roman                                     | Medium     | Math            | Done | Done       |
| 15 | Three Sum                                            | Medium     | Two Pointers    |      | Done       |
| 16 | Three Sum Closest                                    | Medium     | Two Pointers    |      | Done       |
| 17 | Letter Combinations of a Phone Number                | Medium     | Backtracking    |      | Done       |
| 18 | Four Sum                                             | Medium     | Two Pointers    |      | Done       |
| 19 | Remove Nth Node From End of List                     | Medium     | Linked List     |      | Done       |
| 21 | Merge Two Sorted Lists                               | Easy       | Linked List     | Done |            |
| 22 | Generate Parentheses                                 | Medium     | Backtracking    |      | Done       |
| 23 | Merge k Sorted Lists                                 | Hard       | Linked List     |      | Done       |
| 26 | Remove Duplicates from Sorted Array                  | Easy       | Arrays          | Done |            |
| 27 | Remove Element                                       | Easy       | Arrays          | Done |            |
| 28 | Find the Index of the First Occurrence in a String   | Easy       | String          | Done |            |
| 29 | Divide Two Integers                                  | Medium     | Math            |      | Done       |
| 31 | Next Permutation                                     | Medium     | Arrays          |      | Done       |
| 34 | Find First and Last Position of Element in Sorted Array | Medium  | Binary Search   |      | Done       |
| 35 | Search Insert Position                               | Easy       | Binary Search   | Done |            |
| 36 | Valid Sudoku                                         | Medium     | Arrays          |      | Done       |
| 38 | Count and Say                                        | Medium     | String          |      | Done       |
| 58 | Length of Last Word                                  | Easy       | String          | Done |            |

**Total: 30 solutions** (18 Java, 15 TypeScript, 3 overlap)

## Project Structure

```
Java/
  src/main/java/org/adler/
    arrays/         P1, P4, P26, P27
    twopointers/    P11
    linkedlist/     P2, P21
    slidingwindow/  P3
    string/         P5, P6, P8, P28, P58
    math/           P7, P9, P12
    binarysearch/   P35
    dp/             P10
  src/test/java/org/adler/
    (mirrors src/main structure)

TypeScript/
  src/
    twopointers/    P11, P15, P16, P18
    math/           P9, P12, P29
    backtracking/   P17, P22
    linkedlist/     P19, P23
    binarysearch/   P34
    arrays/         P31, P36
    string/         P38
```

## Running

### Java (Maven)

```bash
cd Java

# Run all tests
mvn test

# Run a single test class
mvn test -Dtest="org.adler.arrays.P1TwoSumTest"
```

### TypeScript (pnpm + Vitest)

```bash
cd TypeScript

# Install dependencies
pnpm install

# Run all tests
pnpm test

# Run tests in watch mode
pnpm test:watch

# Lint
pnpm lint

# Type check
pnpm typecheck
```
