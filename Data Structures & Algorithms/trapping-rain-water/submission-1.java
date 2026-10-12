class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }

        // create two int arrays leftMax and rightMax
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        

        leftMax[0] = height[0];
        // run a for loop l on height that stores leftMax for each elem
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        // run a for loop r on height that stores rightMax for each elem
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return res;
    }
}
