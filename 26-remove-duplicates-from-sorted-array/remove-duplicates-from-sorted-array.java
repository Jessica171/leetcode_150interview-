import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>(Arrays.stream(nums).boxed().toList());
        int k = 0;
        for (int num : set) {
            nums[k++] = num;
        }
    return k;
    }
}