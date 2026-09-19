class Solution {
    public boolean isPalindrome(String s) {
        // check if s is empty string
        if (s == "") return true;
        
        // create 2 pointers (i at the 0th index and j at last index)
        int i = 0;
        int j = s.length()-1;
        
        while (i < j) {
            // Skip non-alphanumeric characters from left
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            // Skip non-alphanumeric characters from right
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            // Compare lowercase characters
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            // increment i
            i++;
            // decrement j
            j--;
        }   
        return true;
    }
}
