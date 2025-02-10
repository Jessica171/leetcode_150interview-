class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int num:nums){
            s.add(num);
        }
        if(nums.length > s.size()){
            return true;
        }
        return false;
    }
}