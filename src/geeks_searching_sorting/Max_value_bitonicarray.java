package geeks_searching_sorting;

import java.util.Scanner;

public class Max_value_bitonicarray {
	static   int  max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int test=in.nextInt();
		while (test>0)
		{
			int Size = in.nextInt();
			int [] arr = new int [Size];
			for (int i=0;i<arr.length;i++)
			{
				arr[i]=in.nextInt();
			}
			System.out.println(Binary_search(arr,0,Size-1));
			max=0;
			test--;	
		}
	}

	private static int Binary_search(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
	    int mid=i+j/2;
	    if(arr[mid]>=arr[mid-1] &&arr[mid]>=arr[mid+1])
	    	return arr[mid];
	    if(arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1])
	    	return Binary_search(arr, mid+1, j);
	    else 
		return Binary_search(arr, 1, mid-1);
	}
}
