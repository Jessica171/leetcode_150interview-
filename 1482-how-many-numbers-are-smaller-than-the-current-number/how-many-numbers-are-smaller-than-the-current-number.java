class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] sortnum = nums.clone();
        Arrays.sort(sortnum);

        HashMap<Integer,Integer> numcount = new HashMap<>();
        for(int i = 0; i<sortnum.length;i++){
            numcount.putIfAbsent(sortnum[i],i);
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = numcount.get(nums[i]);
        }

        return result;
    }
}