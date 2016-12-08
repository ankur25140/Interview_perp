package geeks_searching_sorting;

import java.util.Scanner;

public class Facing_the_sun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner (System.in);
    int max_so_far=0;
    int count=0;
    int test=in.nextInt();
    while(test>0)
    {     
    	int Size=in.nextInt();
        int arr[]=new int [Size];
        for(int i=0;i<Size;i++)
        {
        	arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]>max_so_far)
        	{   
        		count++;
        		max_so_far=arr[i];
        		
        	}
        }
     System.out.println(count+"");  
     test--;
     count=0;
     max_so_far=0;
    }
    
	}

}
