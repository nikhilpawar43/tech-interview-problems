package com.interview.problems.container_with_most_water;

public class OptimizedApproach {

    public static void main(String[] args) {
        //int[] heights = {6, 9, 3, 4, 5, 8};
        int[] heights = {7, 1, 2, 3, 9};

        int maxArea = findMaxArea(heights);
        System.out.println(maxArea);
    }

    private static int findMaxArea(int[] heights) {
        int maxArea = 0;

        int a = 0;
        int b = heights.length - 1;

        while (a < b) {
            int smallerWall = Math.min(heights[a], heights[b]);
            int distance = b - a;

            int newArea = smallerWall * distance;
            maxArea = Math.max(maxArea, newArea);

            if (heights[a] <= heights[b]) {
                a++;
            } else {
                b--;
            }
        }

        return maxArea;
    }
}
