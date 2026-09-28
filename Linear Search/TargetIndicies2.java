import java.util.Arrays;

class TargetIndices2 {

    public static int[] findAllIndices(int[] nums, int target) {

        // Step 1: Count occurrences
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            }
        }

        // Step 2: Create an array to store indices
        int[] result = new int[count];

        // Step 3: Find and store matching indices
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[index] = i;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {5, 2, 5, 8, 5, 10};
        int target = 5;

        System.out.println(
            Arrays.toString(findAllIndices(nums, target))
        );
    }
}

    // public static int[] linearSearch(int[] arr, int target) {
    //     int[] indices = new int[arr.length];
    //     int count = 0;

    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == target) {
    //             indices[count] = i;
    //             count++;
    //         }
    //     }

    //     return Arrays.copyOf(indices, count);
    // }

    // public static void main(String[] args) {
    //     int[] numbers = {3, 5, 8, 8, 6};
    //     int target = 8;
    //     int[] result = linearSearch(numbers, target);

    //     if (result.length == 0) {
    //         System.out.println("Element not found in the array.");
    //         return;
    //     }

    //     System.out.println("Element found at indices: " + Arrays.toString(result));
    //     System.out.println("Last occurrence index: " + result[result.length - 1]);
    // }

/*
 * Time Complexity: O(n)
 * The algorithm checks each element at most once.
 *
 * Space Complexity: O(k)
 * Here, k is the number of matching indices found.
 * In the worst case, k can be equal to n.
 */