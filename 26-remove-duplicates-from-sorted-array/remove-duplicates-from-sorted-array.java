import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int index = 0;
        for (int num : nums) {
            if (set.add(num)) {
                nums[index++] = num;
            }
        }
        return index;
    }
}
