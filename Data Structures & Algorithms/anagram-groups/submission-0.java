class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // create a <string,List<string>> HashMap
        Map<String,List<String>> map = new HashMap<>();

        // iterate through every string in strs
        for (String s : strs) {
            // convert each string to char array
            char[] chars = s.toCharArray();

            // sort the char array
            Arrays.sort(chars);

            // save sorted char array as String key
            String key = new String(chars);

            // if key doesn't exist in map -> add it as a new key, new ArrayList
            map.putIfAbsent(key, new ArrayList<>());
            // getkey add string
            map.get(key).add(s);
        }
            
        return new ArrayList<>(map.values());
    }
}
