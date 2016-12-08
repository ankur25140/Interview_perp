package geeks_searching_sorting;

import java.util.Scanner;

public class Floor_in_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner (System.in);
     int test_case=in.nextInt();

    while(test_case>0)
    {       int Size=in.nextInt();
            int [] arr=new int [Size];
            int x=in.nextInt();
           for(int i=0;i<Size;i++)
           {
        	  arr[i]=in.nextInt();   
           }
	int reuslt=Binary_search(arr,0,Size-1,x);
	if(reuslt==-1) System.out.println("-1");
	else System.out.println(reuslt+"");
    	test_case--;
    }
	}
   public static  int  Binary_search(int[] arr, int L,int H, int x)
   {
	   if(L>H)
		   return -1;
	   if(arr[H]<=x) return H;
	   if(arr[L]>x) return -1;
	   int mid = L+H/2;
	    if (mid > 0 && arr[mid-1] <= x && x < arr[mid])
		   return mid-1;
	   if(arr[mid]>x)
         return Binary_search(arr, L, mid-1, x);		   
	   
	   
	   return Binary_search(arr, mid+1, H, x);
	   
	   
	   
	   
   }
}
