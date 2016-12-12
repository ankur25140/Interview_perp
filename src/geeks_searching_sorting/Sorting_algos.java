package geeks_searching_sorting;

import java.util.Scanner;

public class Sorting_algos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int test=0;
		test=in.nextInt();
		while (test>0)
		{
			int size=in.nextInt();
			int [] arr=new int [size];
			for(int i=0;i<size;i++)
			{
				arr[i]=in.nextInt();
			}
			//selection_sort(arr);
			//Bubble_sort(arr);
			merge_sort(arr);
			test--;
		}
	}
	
	private static void merge_sort(int[]arr)
	{ int l=0;
	  int r=arr.length;
		sort(arr,l,r);
		Print(arr);		
	}

	private static void sort(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
	 while (l<r)
	 {
		 int m = l+r/2;
		 sort(arr,l,m);
		 sort(arr,m+1,r);
		 merge(arr,l,m,r);
		 
	 }
	}

	private static void merge(int[] arr, int l, int m, int r) {
		// TODO Auto-generated method stub
	   int n1=m-l+1;
	   int n2=r-m;
	   
		int L[]=new int[n1];
		int R[]=new int [n2];
	  for (int i=0;i<n1;i++)
	  {
		  L[i]=arr[l+i];
	  }
	  for(int j=0;j<n2;j++)
	  {
		  R[j]=arr[m+1+j];
	  }
  int i=0;
  int j=0;
  int k=l;
		while(i<n1&&j<n2)
		{
			if(L[i]<=R[j])
			{
				arr[k]=L[i];
				i++;
			} else 
			{
				arr[k]=R[j];
				j++;
			}
			k++;
		}
	   while(i<n1)
	   {
		   arr[k]=L[i];
		   i++; k++;
	   }
		while(j<n2)
		{
			arr[k]=R[j];
			j++;k++;
		}
		
	}

	private static void Bubble_sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
					Swap(arr[j],arr[j+1]);
				 // swap temp and arr[i]
//                int temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
			}
		}
		Print(arr);		
	}

	private static void Swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp=i;
		i=j;
		j=temp;	
	}

	private static void selection_sort(int[] arr) {
	
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-1;i++)
		{  	int min =i; 
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
					min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
     Print(arr);
		
	}

	private static void Print(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
 
}
