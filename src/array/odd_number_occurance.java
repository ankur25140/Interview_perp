package array;

import java.util.Scanner;

public class odd_number_occurance {
   //in o(n)
	//using xor operations
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int test=in.nextInt();
		while(test>0)
		{  int  sum=0;  
			int size=in.nextInt();
			int arr[] = new int [size];
			for(int i=0;i<size;i++)
			{
				arr[i]=in.nextInt();
				sum=sum^arr[i];
			}
			System.out.println(sum);
			test--;
		}
	}

}
