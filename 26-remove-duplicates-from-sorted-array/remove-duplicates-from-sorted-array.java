class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // Pointer to write the next unique element
        int write = 1;

        // Traverse the array starting from the second element
        for (int read = 1; read < nums.length; read++) {
            // If the current element is different from the previous one, it is unique
            if (nums[read] != nums[read - 1]) {
                // Write the unique element at the write pointer position
                nums[write] = nums[read];
                // Move the write pointer to the next position
                write++;
            }
        }

        // The write pointer indicates the number of unique elements
        return write;
    }
}