class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() < 1) return true;
        int j = 0, i = 0;
        while(i < t.length() && j < s.length()){
            if(t.charAt(i) == s.charAt(j)){
                i++; j++;
            } else {
                i++;
            }
            if(j == s.length()) return true;
        }
        return false;
    }
}