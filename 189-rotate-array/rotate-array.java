class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        if (k == 0 || n <= 1) return; 

        int count = 0; // Number of elements moved
        for (int start = 0; count < n; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}