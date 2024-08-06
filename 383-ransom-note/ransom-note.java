class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> cons = new HashMap<>();
        for(char c : magazine.toCharArray()){
            cons.put(c,cons.getOrDefault(c,0)+1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (!cons.containsKey(c) || cons.get(c) == 0) {
                return false;
            }
            cons.put(c, cons.get(c) - 1);
        }
        
        return true;
    }
}