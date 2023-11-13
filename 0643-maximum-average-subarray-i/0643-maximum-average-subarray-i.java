class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }  
        double max_ = (double)sum/(double)k;
        int i = 0, j = k-1;
        while(j < nums.length-1){
            sum -= nums[i];
            sum += nums[j+1];
            max_ = Math.max(max_, (double)sum/(double)k);
            i++; j++;
        }
        return max_;
    }
}