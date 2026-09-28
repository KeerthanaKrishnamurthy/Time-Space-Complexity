import java.util.ArrayList;

class TargetIndices {
    public static ArrayList<Integer> linearSearch(int[] arr, int target) {

        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indices.add(i);
            }
        }
        return indices; // Return the list of indices where the target is found
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 8, 8, 6};
        int target = 8;
        ArrayList<Integer> result = linearSearch(numbers, target);

        if (!result.isEmpty()) {
            System.out.println("Element found at indices: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        System.out.println("Element Last Occurrence: " + result.get(result.size() - 1));
    }
}

/* Time Complexity: O(n), where n is the number of elements in the array. 
 This is because, in the worst case, the algorithm may need to check each 
 element in the array once to find the target or determine that it is not 
 present.
*/

/* Space Complexity: O(n), as it uses an ArrayList to store the indices of 
the target, which in the worst case could be equal to the size of the input 
array if all elements are the target.
*/