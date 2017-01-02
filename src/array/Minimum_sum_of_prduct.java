package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Minimum_sum_of_prduct {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner (System.in);
    int test=in.nextInt();
    while(test>0)
    	
    {    int sum =0;
    	int size = in.nextInt();
    	 ArrayList arrA = new ArrayList();
    	 ArrayList arrB = new ArrayList();
    	for(int i=0;i<size;i++)
    	{
    		arrA.add(in.nextInt());
    	}
    	for(int i=0;i<size;i++)
    	{
    		arrB.add(in.nextInt());
    	}
    	Collections.sort(arrA);
    	Collections.sort(arrB);
        Collections.reverse(arrB);  
    	for(int i=0;i<size;i++)
    	{
    	   sum=sum+	(int)arrA.get(i)*(int)arrB.get(i);
    	}
        System.out.println(sum);
        
    	test--;
    }
	} 

}
