public class countUniqueAndMoveAtStarting {
        public int removeDuplicates(int[] nums) {
            int counter=1;
            int i=0;
            int j=i+1;
            for(;  j<nums.length; )
            {
                if(nums[j]==nums[j-1])
                {
                    j++;
                }
                else
                {
                    nums[i+1]=nums[j];
                    i++;
                    j++;
                    counter++;
                }
            }
            return counter;
        }
    }

