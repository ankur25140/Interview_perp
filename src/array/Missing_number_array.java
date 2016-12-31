package array;

import java.util.Scanner;

public class Missing_number_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
	    int test = in.nextInt();
	    while (test>0)
	    {   int sum = 0 , final_sum=0;; 
	    	int size=in.nextInt();
	    	int arr[] = new int [size];
	    	for(int i=0;i<size;i++)
	    	{ 
	    		arr[i]=in.nextInt();
	    	}
	    	System.out.println(getMissingNo(arr,size));
	    		    test--;    
	    }
	    }

	static /* getMissingNo takes array and size of array as arguments*/
	 int getMissingNo (int a[], int n)
	{
	    int i, total;
	    total  = (n+1)*(n+2)/2;   
	    for ( i = 0; i< n; i++)
	       total -= a[i];
	    return total;
	}

		

}
