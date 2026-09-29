public class CountOfTarget{
    public static void main(String[] args){
        int[] nums = {1, 5, 3, 4, 5, 6, 7, 8, 9, 5, 5};
        int target = 5;
        System.out.println(targetCount(nums, target));
    }

    public static int targetCount(int[] nums, int target){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                count++;
            }
        }
        return count;
    }
}