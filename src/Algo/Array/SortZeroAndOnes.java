package Algo.Array;

import java.util.Arrays;

public class SortZeroAndOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0};
        int i = 0, j = arr.length - 1;
        while (i < j) {
            // if arr[i] and arr[j] are 1, then decrement j
            // as there is a possibility of zero that we can swap again

            if (arr[i] == 1 && arr[j] == 1) {
                j--;
            } else if (arr[i] == 0 && arr[j] == 0) {  // arr[i] = 0 and arr[j] = 0 then increase i as
                // there is possibility of 1 that we can swap next time
                i++;
            } else if (arr[i] == 1 && arr[j] == 0) { //arr[i] = 1 and arr[j] = 0 then swap it
                // and i++
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            } else {  // arr[i] = 0 and arr[j]= 1 then i++
                i++;
            }
        }
        System.out.println("Sorted Array " + Arrays.toString(arr));
    }
}
