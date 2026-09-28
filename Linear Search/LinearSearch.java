class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 2, 8, 6};
        int target = 86;
        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
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