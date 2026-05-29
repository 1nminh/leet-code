import { describe, it, expect } from "vitest";
import { convert } from "./P6ZigzagConversion";

describe("P6 Zigzag Conversion", () => {
  it('should return "PAHNAPLSIIGYIR" for "PAYPALISHIRING" with 3 rows', () => {
    expect(convert("PAYPALISHIRING", 3)).toBe("PAHNAPLSIIGYIR");
  });

  it('should return "PINALSIGYAHRPI" for "PAYPALISHIRING" with 4 rows', () => {
    expect(convert("PAYPALISHIRING", 4)).toBe("PINALSIGYAHRPI");
  });

  it('should return "A" for "A" with 1 row', () => {
    expect(convert("A", 1)).toBe("A");
  });
});
