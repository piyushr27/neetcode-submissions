class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // create 2 pointers i = 0 and j = numbers.length-1
        int i = 0;
        int j = numbers.length - 1;
        while (i<j) {
            int sum = numbers[i] + numbers[j];
            if (sum < target) {
                i++; // Sum is too small, move left pointer right
            } else if (sum > target) {
                j--; // Sum is too large, move right pointer left
            } else {
                // Target found! Convert 0-indexed to 1-indexed
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[0];
    }
}
