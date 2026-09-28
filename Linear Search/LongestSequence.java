class LongestSequence{
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 1, 3, 5, 7, 2, 4};

        int[] answer = longestSequence(nums);
        System.out.println("Start Index: " + answer[0] + ", Last Index: " + answer[1]);
    }

    public static int[] longestSequence(int[] nums){
        int i = 0;
        int j = i+1;
        
        int count = 0;

        int maxCount = 0;
        int bestStart = 0;
        int bestEnd = 0;

        while(j < nums.length){
            if(nums[j] > nums[j-1]){
                j++;
                count++;
                if(count > maxCount){
                    maxCount = count;
                    bestStart = i;
                    bestEnd = j-1;
                }
            }
            else{
                i = j;
                j = i + 1;
                count = 0;
            }
        }
            
        return new int[]{bestStart, bestEnd};
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)