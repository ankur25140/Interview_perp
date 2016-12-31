package array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class majority_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner (System.in);
    int test = in.nextInt();
    while (test>0)
    {    int majority_element=0;
    	HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();  
    	int size=in.nextInt();
    	int arr[] = new int [size];
    	for(int i=0;i<size;i++)
    	{
    		arr[i]=in.nextInt();
    	    if(hm.containsKey(arr[i]))
    	    {
    	    	hm.replace(arr[i], hm.get(arr[i])+1); 
    	    } else hm.put(arr[i], 1);
    	}
    	int maxValueInMap=(Collections.max(hm.values()));  // This will return max value in the Hashmap
     
    	if(maxValueInMap>size/2)
       {
    	   for (Entry<Integer, Integer> entry : hm.entrySet()) {  // Itrate through hashmap
               
           	if (entry.getValue()==maxValueInMap) {
           		majority_element=entry.getKey();
               }            }
    	   System.out.println(majority_element);
       } else 
    	   System.out.println("NO Majority Element");
    	
    	test--;
    }
	}

}
