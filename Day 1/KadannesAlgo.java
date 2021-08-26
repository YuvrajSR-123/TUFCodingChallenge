//Kadane’s Algorithm
//TC=O(N)
//SC=O(1)

class KadannesAlgo
{
    public int maxSubArray(int[] nums) {
        
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            max=Integer.max(sum,max);
            if(sum<0)
                sum=0;
        }
        return max;
    }
}