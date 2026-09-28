class LastOccurrence {
    public static int linearSearch(int[] arr, int target) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result = i; // Update the result to the current index
            }
        }
        return result; // Return the last found index or -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] numbers = {3, 8, 2, 8, 6};
        int target = 8;
        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Last Occurrence of Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

/* Time Complexity: O(n), where n is the number of elements in the array. 
 This is because, in the worst case, the algorithm may need to check each 
 element in the array once to find the target or determine that it is not 
 present.
*/

/* Space Complexity: O(1), as it only uses a constant amount of extra space 
 regardless of the size of the input array.
*/