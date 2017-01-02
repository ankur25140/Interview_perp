package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Leader_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner (System.in);

int test = in.nextInt();
while(test>0){
   
	int leader_so_far=0;
	int size = in.nextInt();
	int arra[]= new int[size];
     ArrayList<Integer> Leader= new ArrayList<>();
	for(int i=0;i<size;i++)
	{
		arra[i]=in.nextInt();
	}
	for(int j=size-1;j>=0;j--)
	{
		if(arra[j]>=leader_so_far)
		{  leader_so_far=arra[j];
          Leader.add(arra[j]);
}     

	}
	Collections.reverse(Leader);
	for(int i=0; i<Leader.size();i++)
	{    if(i<Leader.size()-1)
		 System.out.print(Leader.get(i)+" " );
	else 		 System.out.print(Leader.get(i)+"\n" );

	}
	test--;
}
	}
}
