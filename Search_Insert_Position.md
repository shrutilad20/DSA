/**
 * 🏹 Search Insert Position - Binary Search (O(log n))
 
 * ✅ Given a sorted array of distinct integers and a target value:
 *    - If found, return its index.
 *    - If not found, return the index where it should be inserted.
 * ✅ Must run in O(log n) time complexity.
 
 * 📌 Example:
 *    Input: nums = [1,3,5,6], target = 5  → Output: 2
 *    Input: nums = [1,3,5,6], target = 2  → Output: 1
 
 * 🔥 Uses Binary Search for efficiency.
   
 * GitHub: https://github.com/shrutilad20
 */

class SearchInsertPosition {
    /**
     * Function to find the search insert position using Binary Search.
     *
     * @param nums - Sorted array of distinct integers
     * @param target - Target value to search for
     * @return Index where the target is found or should be inserted
     */
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents overflow

            if (nums[mid] == target) return mid; // Target found
            else if (nums[mid] < target) left = mid + 1; // Search right half
            else right = mid - 1; // Search left half
        }

        return left; // Correct insertion position
    }

    /**
     * Main function for testing.
     */
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println("Index: " + searchInsert(nums, target)); // Output: 2

        target = 2;
        System.out.println("Index: " + searchInsert(nums, target)); // Output: 1

        target = 7;
        System.out.println("Index: " + searchInsert(nums, target)); // Output: 4

        target = 0;
        System.out.println("Index: " + searchInsert(nums, target)); // Output: 0
    }
}
