class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] answer = new int [n];
        int[] prefix = new int[n];
        prefix[0] = 1;  // No left product for first element
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Step 2: Compute Suffix Products and Multiply with Prefix
        int suffix = 1; // No right product for last element
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = prefix[i] * suffix;
            suffix *= nums[i];}
    return answer;
    }
}