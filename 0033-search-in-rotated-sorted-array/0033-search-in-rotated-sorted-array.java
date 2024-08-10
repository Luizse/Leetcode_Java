class Solution {
    public int search(int[] nums, int target) {
        int pivot = 0;

        // Find the rotation pivot where the array rotation happened
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If the target is at the pivot point, return the pivot
        if (nums[pivot] == target) {
            return pivot;
        }

        // Search the left part of the array (from pivot+1 to the end)
        for (int i = pivot + 1; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        // Search the right part of the array (from the start to pivot)
        for (int i = 0; i <= pivot; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        // If the target is not found, return -1
        return -1;
    }
}
