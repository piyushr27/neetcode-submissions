class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            int count = 1;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == nums[i]) count++;
            }
            if (count > 1) return true;
        }
        return false;
    }
}