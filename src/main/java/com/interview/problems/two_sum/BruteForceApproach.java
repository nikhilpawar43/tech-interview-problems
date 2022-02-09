package com.interview.problems.two_sum;

import java.util.Arrays;

public class BruteForceApproach {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 7, 9, 2};
        int target = 11;
        int[] targetPair = findPairWhoseAdditionIsTarget(numbers, target);

        System.out.println(Arrays.toString(targetPair));
    }

    private static int[] findPairWhoseAdditionIsTarget(int[] numbers, int target) {
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                int numberToFind = target - numbers[i];

                if (numberToFind == numbers[j]) {
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }
}
