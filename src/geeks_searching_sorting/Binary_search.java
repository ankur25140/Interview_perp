package geeks_searching_sorting;

import java.util.Scanner;

public class Binary_search {
     int L,H;
	static int num , mid;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n]; 
      for(int i=0;i<n;i++)
      {
    	  arr[i]=in.nextInt();
      }
       num=in.nextInt();
       in.close();
     if(Binary_search(arr,0,n,num)==0)
    	 System.out.println("not Found");

     else     
    	 System.out.println("Found at "+ mid);

	}
	public static int Binary_search(int[] arr,int L,int H,int num)
	{
		if(H>=L)
		{
		 	mid=1+(H-1)/2;
		 	if(arr[mid]==num)
		 		return mid;
		 	else if(arr[mid]>num)
		 		Binary_search(arr, 1, mid-1, num);
		 	else Binary_search(arr,mid+1, H, num);
		}
		return 0;
		
	}

}
