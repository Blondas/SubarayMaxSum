package com.krisdrum;

public class MaxSumOfElements {
    public static void main(String[] args) {
        int [] arr = {1, -5, 10, 13, -4};
        int [] arr1 = {-1,-2,2,-3,7,-4,1,6,-5,10};

        System.out.println(max(arr));
        System.out.println(max(arr1));
    }

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
