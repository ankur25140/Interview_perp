package geeks_searching_sorting;

import java.util.Scanner;

public class unsorted_subarray {
//Given an unsorted array arr[0..n-1] of size n,
//	find the minimum length subarray arr[s..e] such that 
//	sorting this subarray makes the whole array sorted.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int s = 0,e = 0;
		int size=in.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
   for(int i=0;i<arr.length;i++)
   {
	   if(arr[i]>arr[i+1])
		   s=i;
	   break;
   } 
   for(int i=arr.length-1;i>0;i--)
   {
	   if(arr[i]<arr[i-1])
		   e=i;
	   break;
   }
		for(int i=0;i<s;i++)
		{
			if(arr[i]>arr[s])
				s=i;
			break;
		}
		for(int i=arr.length;i>=e+1;i--)
		{
			if(arr[i]<arr[e])
				e=i;
			break;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
