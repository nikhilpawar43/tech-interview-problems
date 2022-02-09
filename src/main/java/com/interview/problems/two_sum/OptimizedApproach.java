package com.interview.problems.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OptimizedApproach {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 7, 9, 2};
        int target = 13;
        int[] targetPair = findPairWhoseAdditionIsTarget(numbers, target);

        System.out.println(Arrays.toString(targetPair));
    }

    private static int[] findPairWhoseAdditionIsTarget(int[] numbers, int target) {
        Map<Integer, Integer> previousNumberMap = new HashMap<>();
        
        for (int i=0; i<numbers.length; i++) {
            int numberToFind = target - numbers[i];
            
            if (previousNumberMap.containsKey(numberToFind)) {
                return new int[] { previousNumberMap.get(numberToFind), i };
            }
            previousNumberMap.put(numbers[i], i);
        }
        
        return null;
    }
}
