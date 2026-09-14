class Solution {
    public boolean isAnagram(String s, String t) {
        //frequency array method
        // check if lengths are unequal (return false;)
        if (s.length() != t.length()) return false;

        // create an array count[26] 
        int[] count = new int[26];

        // run a for loop till s.length (which is equal to t.length)
        for (int i=0; i<s.length();i++) {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
            
        // check if any val in count[26] is not 0 -> return false
        for (int val : count) {
            if (val != 0) {return false;}
        }
        return true;
    }
}
