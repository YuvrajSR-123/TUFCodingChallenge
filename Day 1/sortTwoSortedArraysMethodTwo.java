//Merge two sorted Arrays without extra space
//TC=O(N)
//SC=O(1)

public class sortTwoSortedArraysMethodTwo
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
   {
       
       int i=0,j=0,k=0;
       long res[]=new long[n+m];
       
       while(i<n && j<m)
       {
           if(arr1[i]<arr2[j])
           {
               res[k]=arr1[i];
               k++;i++;
           }
           else if(arr2[j]<arr1[i])
           {
               res[k]=arr2[j];
               j++;k++;
           }
           else
           {
               res[k]=arr1[i];
               k++;i++;
           }
       }
       
       while(i<n)
       {
           res[k]=arr1[i];
           k++;i++;
       }
       while(j<m)
       {
            res[k]=arr2[j];
            j++;k++;   
       }
       
       k=0;
       for(int h=0;h<n;h++)
       {
           arr1[h]=res[k];
           k++;
       }
       for(int h=0;h<m;h++)
       {
           arr2[h]=res[k];
           k++;
       }
       
   }
}