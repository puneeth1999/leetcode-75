class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i++){
            boolean left = true;
            boolean right = true;
            if(i != 0)
                left = flowerbed[i-1] == 0 ? true : false;
            if(i != flowerbed.length - 1)
                right = flowerbed[i+1] == 0 ? true : false;
            if(left && right && flowerbed[i] != 1){
                n--;
                flowerbed[i] = 1;
            } 
            if(n <= 0) return true;
        }
        return false;
    }
}