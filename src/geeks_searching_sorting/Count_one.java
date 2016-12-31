package geeks_searching_sorting;

import java.util.Scanner;

public class Count_one {
//Given a binary array sorted in non-increasing order, count the number of 1’s in it.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    int size=in.nextInt();
    int arr[]=new int [size];
    for(int i=0;i<size;i++)
    {
    	arr[i]=in.nextInt();
    }
    System.out.println(Binary_search(arr,0,arr.length-1)+""); 
	}
    private static int Binary_search(int[] arr, int l, int h) {
	// TODO Auto-generated method stub
 	if(h>=l)
 	{
 		int mid=l+(h-l)/2;
 		if((arr[mid]==h||arr[mid+1]==0)&&arr[mid]==1)
 			return mid+1;
        if(arr[mid]==1)
        	return Binary_search(arr, mid+1, h);
        else 
        	return Binary_search(arr, l, mid-1);
 	}
 return 0;
}

}
