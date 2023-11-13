class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> res = new ArrayList<Boolean>();
        int greatest = Integer.MIN_VALUE;
        for(int i = 0; i < candies.length; i++){
            greatest = Math.max(candies[i], greatest);
        }
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= greatest){
                res.add(true);
            }else
                res.add(false);
        }
        return res;
    }
}