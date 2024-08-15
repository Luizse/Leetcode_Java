class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
        int[] answer = new int[n];
        
        int totalProduct = 1;
        int zeroCount = 0;

        // Calculate the total product of non-zero elements and count the number of zeros
        for (int num : nums) {
            if (num != 0) {
                totalProduct *= num;
            } else {
                zeroCount++;
            }
        }
        
        // Populate the answer array based on zero count
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                answer[i] = 0;  // If there is more than one zero, all products are zero
            } else if (zeroCount == 1) {
                if (nums[i] == 0) {
                    answer[i] = totalProduct;  // Only the position with zero gets the total product
                } else {
                    answer[i] = 0;  // All other positions are zero
                }
            } else {
                answer[i] = totalProduct / nums[i];  // No zeros, regular division
            }
        }
        
        return answer;
    }
}