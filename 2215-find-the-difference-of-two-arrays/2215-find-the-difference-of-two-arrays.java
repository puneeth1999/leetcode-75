class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Boolean> n1 = new HashMap<Integer, Boolean>();
        for(int i = 0; i < nums1.length; i++){
            n1.put(nums1[i], false);
        }

        HashMap<Integer, Boolean> n2 = new HashMap<Integer, Boolean>();
        for(int i = 0; i < nums2.length; i++){
            n2.put(nums2[i], false);
        }

        List<Integer> res1 = new ArrayList<Integer>();

        for(int i = 0; i < nums1.length; i++){
            if(!n2.containsKey(nums1[i]) && !n1.get(nums1[i])){
                res1.add(nums1[i]);
                n1.put(nums1[i], true);
            }
        }

        List<Integer> res2 = new ArrayList<Integer>();

        for(int i = 0; i < nums2.length; i++){
            if(!n1.containsKey(nums2[i]) && !n2.get(nums2[i])){
                res2.add(nums2[i]);
                n2.put(nums2[i], true);
            }
        }
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(res1);
        res.add(res2);

        return res;
    }
}