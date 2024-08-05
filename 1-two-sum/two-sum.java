class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> uniquesum= new HashMap<>();
        for (int i = 0; i< nums.length;i++){
            int complement = target - nums[i];
            if (uniquesum.containsKey(complement)) {
                return new int[] { uniquesum.get(complement), i };
                }
            uniquesum.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}