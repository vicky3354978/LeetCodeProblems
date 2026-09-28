class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while(j<nums.length)
        {
            if(nums[i]==0)
            {
                if(nums[j]!=0)
                {
                    int temp;
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                }
              
                j++;
            }
            else
            {
                i++;
                j++;  
            }
            
        }
        for(int k=0; k<nums.length; k++)
        {
            System.out.println(nums[k]);
        }
    }
}