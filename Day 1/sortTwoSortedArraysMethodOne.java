//Merge two sorted Arrays without extra space
//TC=O(N*M)
//SC=O(1)

public class sortTwoSortedArraysMethodOne
{
public static void sortTwoSortedArrays(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i=0;
        while(i<n)
        {
            if(arr1[i]>arr2[0])
            {
                long g=arr1[i];
                long t=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=t;int j;
                for(j=1;j<m && arr2[j]<g;j++)
                {
                    arr2[j-1]=arr2[j];
                }
                arr2[j-1]=g;
            }
            i++;
        }
    }
}