class Solution {
    public String reverseWords(String s) {
        // Split
        String[] arr = s.split(" ");
        String res = "";
        for(int i = arr.length - 1; i >= 0; i--){
            if(!arr[i].strip().equals(""))
                res += arr[i].strip() + " ";
        }
        return res.strip(); 
    }
}