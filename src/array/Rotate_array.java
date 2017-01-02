package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner (System.in);
    int test=in.nextInt();
    while(test>0)
    {   ArrayList<Integer> rotate= new ArrayList<>();
    	int size = in.nextInt();
    int d = in.nextInt();
    for(int i=0;i<size;i++)
    {
    	rotate.add(in.nextInt());
    }
    for (int i=0;i<d;i++)
    {   
    	rotate.add(rotate.get(i));
    } 
    for(int i=0;i<d;i++)
    {
    	rotate.remove(i);

    }
    for(int i=0; i<rotate.size();i++)
	{    if(i<rotate.size()-1)
		 System.out.print(rotate.get(i)+" " );
	else 		 System.out.print(rotate.get(i)+"\n" );

	}
    	test--;
    }

	}

}
