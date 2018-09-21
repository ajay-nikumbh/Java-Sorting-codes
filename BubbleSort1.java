		//Program for Bubble sort in descending order
import java.util.*;
class BubbleSort1
{
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] < arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
   
    public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
        BubbleSort1 ob = new BubbleSort1();
		System.out.println("Enter the array size");
		int  n=sc.nextInt();
        int a[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
        ob.bubbleSort(a);
        System.out.println("Sorted array");
        ob.printArray(a);
    }
}