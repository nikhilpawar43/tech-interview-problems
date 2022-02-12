package com.interview.problems.container_with_most_water;

public class BruteForce {

    public static void main(String[] args) {
        int[] walls = {6, 9, 3, 4, 5, 8};
        //int[] walls = {7, 1, 2, 3, 9};
        int area = findAreaWithMaxWater(walls);

        System.out.println(area);
    }

    // [6, 9, 3, 4, 5, 8]
    private static int findAreaWithMaxWater(int[] walls) {
        int currentArea = 0;

        for (int i=0; i<walls.length; i++) {
            for (int j=i+1; j<walls.length; j++) {
                int smallerWall = Math.min(walls[i], walls[j]);
                int distance = j - i;

                int newArea = smallerWall * distance;
                currentArea = Math.max(currentArea, newArea);
            }
        }

        return currentArea;
    }
}
