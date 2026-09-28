class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++)
        {
            if(digit(nums[i])==i)
            {
                return i;
            }
        }
        return -1;
       
    }
     public static int digit(int n)
        {
            int dig;
            int sum=0;
            while(n>0)
            {
                dig=n%10;
                sum=sum+dig;
                n=n/10;
            }
            return sum;
        }

}