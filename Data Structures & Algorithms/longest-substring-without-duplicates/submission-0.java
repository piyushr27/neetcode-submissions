class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        
        Set<Character> charSet = new HashSet<>();
        int i = 0;
        int maxLen = 1;

        for (int j = 0; j < s.length(); j++) {
            while (charSet.contains(s.charAt(j))) {
                charSet.remove(s.charAt(i));
                i++;
            }
            charSet.add(s.charAt(j));
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}