class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        if(nums.length==1)
        return;
        while(j<nums.length)
        {
            if(nums[i]==0)
            {
                if(nums[j]!=0)
                {
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                }
                else
                j++;
            }
            else
            {
            i++;
            j++;
            }
        }
        return;
    }
}