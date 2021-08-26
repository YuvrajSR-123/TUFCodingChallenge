//Repeat and Missing Number 
//TC=O(N)
//SC=O(1)

public class repeatingAndMissing 
{
    int[] findTwoElement(int arr[], int n) {
        // code here
        
        int pos[]=new int[n+1];
        int res[]={-1,-1};

        for(int i=0;i<n;i++)
        {
            pos[arr[i]]++;
        }

        for(int i=1;i<n+1;i++)
        {
            if(pos[i]==0)
            {
                res[1]=i;
            }
            else if(pos[i]>1)
            {
                res[0]=i;
            }
        }
        
        return res;
    }
}