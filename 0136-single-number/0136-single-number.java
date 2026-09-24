class Solution {
    public int singleNumber(int[] nums) {
        int i=0;
        int result=0;
        for(; i<nums.length; i++)
        {
            result=result^nums[i];
            
        }
        return result;
    }
}