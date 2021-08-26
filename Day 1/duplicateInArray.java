//Find the duplicate in an array of N+1 integers.

//TC=O(log n) 
//SC=O(1)

public class duplicateInArray
{
public int dupicateInArray(int arr[])
    {
        int m=arr.length;
        int pos[]=new int[m];
        int i=0;
        while(i<arr.length)
        {
            pos[arr[i]]++;
            if(pos[arr[i]]>1)
            {
                return arr[i];
            }
            i++;
        }
        return -1;
    }
}
