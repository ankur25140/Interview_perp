package array;

import java.util.Arrays;
import java.util.Scanner;

public class PYTHAGOREAN_TRIPLET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PYTHAGOREAN_TRIPLET triplet = new PYTHAGOREAN_TRIPLET(); 
		Scanner in = new Scanner (System.in);
		    int test=in.nextInt();
		    while(test>0)
		    {  
		    	int size = in.nextInt();
		    	int arr[] = new int [size];
		    	for(int i=0;i<size;i++)
		    	{
		    	  int temp=in.nextInt();	
		    	  arr[i]=temp*temp;
		    	}
		    System.out.println(triplet.is_triplet(arr,size));	
		    test--;
		    }
	}

	private  String  is_triplet(int[] arr, int size) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		for (int i = arr.length-1; i >= 2; i--)
        {

            int l = 0; // index of the first element in arr[0..i-1]
            int r = i-1; // index of the last element in arr[0..i-1]
            while (l < r)
            {
                // A triplet found
                if (arr[l] + arr[r] == arr[i])
                    return "Yes";
  
                // Else either move 'l' or 'r'
                if (arr[l] + arr[r] < arr[i])
                   l++;
                else
                   r--;
            }
        }
				return "No";
	}

}
