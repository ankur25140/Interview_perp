package array;

import java.util.Scanner;

public class zig_zag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner (System.in);
		    int test=in.nextInt();
		    while(test>0)
		    {  
		    	boolean flag = true;
		    	int size = in.nextInt();
		    	int arr[] = new int [size];
		    	for(int i=0;i<size;i++)
		    	{
		    	  arr[i]=in.nextInt();	
		    	}
		        for(int i=0;i<size-1;i++)
		        {   //true flag means "<"
		        	if(flag)
		        	{
		        		if(arr[i]>arr[i+1])
		        		{
		        			int temp = arr[i];
		        			arr[i]=arr[i+1];
		        			arr[i+1]=temp;
		        		}
		        	} 
		        	else 
		        	{
		        		if(arr[i]<arr[i+1])
		        		{
		        			int temp = arr[i];
		        			arr[i]=arr[i+1];
		        			arr[i+1]=temp;
		        		}
 		        	 }
		        	flag=!flag;
		        	
		        }
		    	
		        for(int i=0;i<size;i++)
		    	{
		        	if(i<size-1)
		                 System.out.print(arr[i]+" ");
		       	else 		 System.out.print(arr[i]+"\n" );

}
		    	
		    	
		    	test--;
		    }
		
		
	}

	

}
