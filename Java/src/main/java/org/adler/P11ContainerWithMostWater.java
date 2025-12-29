package org.adler;

public class P11ContainerWithMostWater {
    public static void main(String[] args) throws Exception {
        System.out.println("Problem 11");
        P11ContainerWithMostWater solution = new P11ContainerWithMostWater();
        System.out.println(solution.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 })); // 49
        System.out.println(solution.maxArea(new int[] { 1, 1 })); // 1
        System.out.println(solution.maxArea(new int[] { 4, 3, 2, 1, 4 })); // 16
        System.out.println(solution.maxArea(new int[] { 1, 2, 1 })); // 2
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        

        return maxArea;
    }
}
