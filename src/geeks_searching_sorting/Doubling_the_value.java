/**
 * 
 */
package geeks_searching_sorting;

import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

/**
 * @author ankur_personal
 *
 */
public class Doubling_the_value {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in = new Scanner(System.in);
     int test_case=in.nextInt();
     while(test_case>0)
     {   
    	 int size= in.nextInt();
    	 int [] arr = new int [size];
    	 int b=in.nextInt();
    	 for(int i=0;i<size;i++)
    	 {
    		 arr[i]=in.nextInt();
    	 }
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 if(arr[i]==b)
    		 {
    			 b=b*2;
    		 }
    	 }
    	 System.out.println(b);
    	 test_case--;
    	 size=0;
    	 b=0;
     }
    	
	}

}
