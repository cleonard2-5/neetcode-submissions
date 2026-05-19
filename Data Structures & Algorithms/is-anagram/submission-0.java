class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s_map = new HashMap<>();
        HashMap<Character, Integer> t_map = new HashMap<>();
        for (char letter: s.toCharArray()) {
            s_map.merge(letter, 1, Integer::sum);
        }
        for (char letter: t.toCharArray()) {
            t_map.merge(letter, 1, Integer::sum);
        }
        return s_map.equals(t_map);
    }
}
