class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> countT = new HashMap<>();

        for (char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0)+1);
        }

        Map<Character, Integer> window = new HashMap<>();

        int have = 0;
        int need = countT.size();

        int minLen = Integer.MAX_VALUE;
        int resL = -1, resR = -1;

        //use a sliding window to traverse s using l and r indicies
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c,0)+1);

            // Update have : Check if current character satisfies target frequency requirement
            if (countT.containsKey(c) && window.get(c).equals(countT.get(c))) {
                have++;
            }

            // Shrink window from the left while all requirements are satisfied
            while (have == need) {
                if (r-l+1 < minLen) {
                    minLen = r - l + 1;
                    resR = r;
                    resL = l;
                }
                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar)-1);

                if (countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar)) {
                    have--;
                }
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(resL, resR+1); 
    }
}
