class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort nums in ascending order
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // If the smallest number is > 0, no 3 numbers can sum to 0
            if (nums[i] > 0) break;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++; // Sum too small, increase left pointer
                } else if (sum > 0) {
                    right--; // Sum too large, decrease right pointer
                } else {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate values for second and third elements
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
            }
        }
        return res;
    }
}
