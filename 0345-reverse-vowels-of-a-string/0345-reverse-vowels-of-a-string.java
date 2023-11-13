class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<Character>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int i = 0, j = s.length()-1;
        char[] charArr = new char[s.length()];
        for(int k = 0; k < s.length(); k++){
            charArr[k] = s.charAt(k);
        }
        while(i < j && j >= 0 && i < s.length()){
            while(i < s.length() && !vowels.contains(charArr[i])){
                i ++;
            }
            while(j >= 0 && !vowels.contains(charArr[j])){
                j--;
            }
            if(i >= j) break;
            // swap
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
            // incr and decr
            i ++;
            j--;
        }
        return String.valueOf(charArr);
    }
}