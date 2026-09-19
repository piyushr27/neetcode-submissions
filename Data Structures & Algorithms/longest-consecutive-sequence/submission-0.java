class Solution {
    public int longestConsecutive(int[] nums) {
        // create a HashSet<Integer> numSet to store nums
        Set<Integer> numSet = new HashSet<>();

        // iterate over num in nums
        for (int num : nums) {
            // add num to numSet
            numSet.add(num);
        }
        
        // create int longest=0 to store longest streak
        int longest = 0;

        // iterate over num in numSet
        for (int num : numSet) {
            if(!numSet.contains(num-1)) {
                int streak = 1;
                while (numSet.contains(num+streak)){
                    streak++;
                }
                longest = Math.max(longest, streak);
            }  
        }
        return longest;
    }
}
