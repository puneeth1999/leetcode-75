class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int i = 0, j = 0;
        while(i < word1.length() && j < word2.length()){
            res += word1.charAt(i);
            res += word2.charAt(j);
            i++;
            j++;
        }
        res += word1.substring(i, word1.length());
        res += word2.substring(j, word2.length());
        return res;
    }
}