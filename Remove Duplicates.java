//Algorithm to remove duplicates from a sorted array.
import java.util.*;
public class Day_007 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        
        return j;
    }

    public static void main(String[] args) {
        Day_007 solution = new Day_007();
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int length = solution.removeDuplicates(nums);
        
        System.out.println("Modified Array:");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
