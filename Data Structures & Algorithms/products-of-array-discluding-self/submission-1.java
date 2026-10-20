class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int product=1;
        int p=1;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                product=product*nums[i];
            }
            if(nums[i]==0)
            {
                count++;
               p=0; 
            }
        }
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0&&p==1)
            {
                result[i]=product/nums[i];
            }
            else if(nums[i]==0&&count==1)
            {
                result[i]=product;
            }
            else
            {
                result[i]=0;
            }
        }
        return result;
    }
}  
