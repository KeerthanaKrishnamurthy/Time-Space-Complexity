
// class TargetWithSmallDiff{
//     public static int[] findAllIndices(int[] nums, int target) {

//         // Step 1: Count occurrences
//         int count = 0;

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target) {
//                 count++;
//             }
//         }

//         // Step 2: Create an array to store indices
//         int[] result = new int[count];

//         // Step 3: Find and store matching indices
//         int index = 0;

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target) {
//                 result[index] = i;
//                 index++;
//             }
//         }
//         switch (result.length) {
//             case 0:
//             case 1:
//                 return new int[]{-1, -1};
//             case 2:
//                 return result;
//             default:
//                 int minDifference = Integer.MAX_VALUE;
//                 int firstIndex = -1;
//                 int secondIndex = -1;

//                 for (int i = 0; i < result.length - 1; i++) {

//                     int difference = result[i + 1] - result[i];

//                     if (difference < minDifference) {
//                         minDifference = difference;

//                         firstIndex = result[i];
//                         secondIndex = result[i + 1];
//                     }
//                 }

//                 return new int[]{firstIndex, secondIndex};
//         }
//     }

//     public static void main(String[] args) {

//         int[] nums = {5, 2, 7, 6, 3, 4, 5, 8, 9, 5, 10};
//         int target = 5;

//         int[] result = findAllIndices(nums, target);


//         for(int num:result){
//             System.out.println(num);
//         }
    
//     }
// }

class TargetWithSmallDiff {

    public static int[] findAllIndices(int[] nums, int target) {

        int previousIndex = -1;
        int minDifference = Integer.MAX_VALUE;

        int firstIndex = -1;
        int secondIndex = -1;

        // Single traversal using linear search
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {

                // Check if target was found previously
                if (previousIndex != -1) {

                    int difference = i - previousIndex;

                    // Update if we found a smaller distance
                    if (difference < minDifference) {

                        minDifference = difference;

                        firstIndex = previousIndex;
                        secondIndex = i;
                    }
                }

                // Remember the current occurrence
                previousIndex = i;
            }
        }

        return new int[]{firstIndex, secondIndex};
    }

    public static void main(String[] args) {

        int[] nums = {5, 2, 7, 6, 3, 4, 5, 8, 9, 5, 10};
        int target = 5;

        int[] result = findAllIndices(nums, target);

        System.out.println("First Index: " + result[0]);
        System.out.println("Second Index: " + result[1]);
    }
}