package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayReversing {
    public static void main(String[] args) {
        // Given an array of integers, reverse this array "In-Place" in linear running time

        /* Algorithm : O(N) linear running time
            - Keep two index references : one at the beginning of the array, another for the end of the array.
            - Keep running the algorithm while the lower_index < higher_index.
                - In every iteration swap the items with both the indices.
                - Increment the lower_index and Decrement the higher_index
                - Start another iteration
                - Termination point : when lower_index = higher_index or lower_index > higher_index
        */

        int[] nums = {1,2,3,4,5};

        ArrayReversing arrayReversing = new ArrayReversing();

        System.out.println(Arrays.toString(arrayReversing.reverseArray(nums)));

    }

// Implementation
    public int[] reverseArray(int[] nums){
        // Initializing indices
        int lowIndex = 0;
        int highIndex = nums.length - 1;

        // Looping through the array
        while (lowIndex < highIndex){
            swap(nums, lowIndex, highIndex);
            lowIndex++;
            highIndex--;
        }

        return nums;
    }

    private void swap(int[] nums, int lowIndex, int highIndex) {
        // Swapping elements
        int temp = nums[lowIndex];
        nums[lowIndex] = nums[highIndex];
        nums[highIndex] = temp;
    }
}
