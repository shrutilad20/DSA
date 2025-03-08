#Search Insert Position
##Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.


#CODE
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids overflow

            if (nums[mid] == target) return mid; // Target found
            else if (nums[mid] < target) left = mid + 1; // Search right half
            else right = mid - 1; // Search left half
        }
        
        return left; // Left will be the correct insertion index
    }
}
