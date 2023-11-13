class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Count zeroes and calculate product without zero
        int zeroes = 0;
        int prod = 1;
        for(int x : nums){
            if(x == 0)
                zeroes++;
            else
                prod *= x;
        }
        int[] res = new int[nums.length];
        // Only three cases are possible
        // zeroes = 0;
        if(zeroes == 0){
            for(int i = 0; i < nums.length; i++){
                res[i] = prod/nums[i];
            }
        } else if(zeroes == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0)
                    res[i] = 0;
                else
                    res[i] = prod;
            }
        } else {
            for(int i = 0; i < nums.length; i++){
                res[i] = 0;
            }
        }
        return res;
    }
}