class Solution {
    public boolean isPalindrome(String s) {
      s = s.toLowerCase();
      StringBuilder filtered = new StringBuilder();
      for(char c : s.toCharArray() ){
        if (Character.isLetterOrDigit(c)){
            filtered.append(c);
        }
      }  
      String filteredString = filtered.toString();
      String reversedString = filtered.reverse().toString();
      return filteredString.equals(reversedString);
    }
}