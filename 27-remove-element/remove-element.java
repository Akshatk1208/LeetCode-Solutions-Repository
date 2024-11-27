class Solution {
    public int removeElement(int[] nums, int val) {
        int a=0;
        int j=nums.length-1;
        while(a<=j)
        {
            if(nums[a]==val)
            {
                if(nums[j]!=val)
            {
                int temp=nums[a];
                nums[a]=nums[j];
                nums[j]=temp;
                a++;
            }
            j--;
            }
            else
            {
                a++;
            }
        
    }
    return a;
    }
}