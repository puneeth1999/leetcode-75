class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // If two strings have a GCD, it is required that STR1 + STR2 = STR2 + STR1
        // EX: ABAB + AB = AB + ABAB; ABCABC + ABC = ABC + ABCABC
        if(!((str1 + str2).equals(str2 + str1))){
            return "";
        }
        int divisor = gcd(str1.length(), str2.length());
        return str1.substring(0, divisor);
    }

    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}