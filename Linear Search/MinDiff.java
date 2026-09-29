class MinDiff {
    public static void main(String[] args) {
        int[] nums = {12, 20, 14};
        int target = 13;
        System.out.println(closestToTarget(nums, target));
    }

    public static int closestToTarget(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int closest = nums[0];
        // Convert to long before subtracting so the difference cannot overflow.
        long minDiff = Math.abs((long) target - closest);

        for (int i = 1; i < nums.length; i++) {
            // The absolute difference tells us how far this number is from target.
            long currentDiff = Math.abs((long) target - nums[i]);

            // Only update for a strictly smaller difference, so the first value wins ties.
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                closest = nums[i];
            }
        }

        return closest;
    }
}