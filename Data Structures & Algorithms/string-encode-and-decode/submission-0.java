class Solution {

    public String encode(List<String> strs) {
        // check if empty arraylist return ""
        if (strs.isEmpty()) return "";
        // create a string encoded_string in StringBuilder
        StringBuilder encoded_string = new StringBuilder();
        
        // iterate through every string in strs
        for (String s : strs) {
            // append length + # + str to encoded_string
            encoded_string.append(s.length()).append('#').append(s);
        }
            
        return encoded_string.toString();
        
    }

    public List<String> decode(String str) {
        // check if length of str = 0 -> return empty arraylist
        if (str.length() == 0) {
            return new ArrayList<>();
        }
        // create a List<String> res
        List<String> res = new ArrayList<>();

        // create a int i = 0
        int i = 0;

        // run while loop till i < str.length()
        while (i < str.length()) {
            int j = i;
            // run a while loop till str[j] != '#'
            while(str.charAt(j) != '#') {
                j++;
            }    
            // store substring(i,j) into int length
            int length = Integer.parseInt(str.substring(i, j));
            i = j+1;
            j = i+length;
            res.add(str.substring(i,j));
            i = j;
        }
        return res;
    }
    
}
