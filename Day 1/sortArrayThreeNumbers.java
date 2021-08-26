//Sort an array of 0’s 1’s 2’s without using extra space or sorting algo 
//TC=O(N)
//SC=O(1)

public class sortArrayThreeNumbers
{
public void sortArray(int arr[], int n)
    {
        int n=nums.length;
        int f=0,m=0,e=n-1;
        for(int i=0;i<n;i++)
        {
            if(nums[m]==0)
            {
                int t=nums[f];
                nums[f]=nums[m];
                nums[m]=t;
                f++;
                m++;
            }
            else if(nums[m]==2)
            {
                int t=nums[e];
                nums[e]=nums[m];
                nums[m]=t;
                e--;
            }
            else
            {
                m++;
            }
                
        }
    }
}