class Solution {
    public int findMin(int[] nums) {
        
        int low = Integer.MAX_VALUE;
        for(int num : nums){
            if(num < low) low = num;
        }
        return low;
    }
}
