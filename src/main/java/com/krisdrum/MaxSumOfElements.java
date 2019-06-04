package com.krisdrum;

public class MaxSumOfElements {
    public static int max(int [] arr) {
        int localMax = 0;
        int globalMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                localMax += arr[i];
            } else if (localMax + arr[i] > 0 ) {
                localMax += arr[i];
            } else {
                localMax = 0;
            }

            if (localMax > globalMax) globalMax = localMax;
         }
        return globalMax;
    }
}
