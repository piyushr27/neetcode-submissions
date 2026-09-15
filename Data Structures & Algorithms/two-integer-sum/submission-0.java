class Solution {
    public int[] twoSum(int[] nums, int target) {
        // check if nums.length <= 1 -> return null 
        if (nums == null || nums.length < 2) return new int[0];

        // Create a <int, int> HashMap
        Map<Integer, Integer> map = new HashMap<>();

        // run a for loop i over nums
        for (int i=0; i < nums.length; i++) {
            int diff = target - nums[i];
            // if HashMap containsKey diff (where diff = target - nums[i])
            if (map.containsKey(diff)) {
                // return int[getValue(diff), i];
                return new int[]{map.get(diff), i};
            }
            // add [nums[i], i] to HashMap
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
