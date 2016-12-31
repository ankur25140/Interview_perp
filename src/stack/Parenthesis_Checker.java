package stack;

import java.util.Scanner;

//Given an expression string exp, examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
//For example, the program should print 'balanced' for exp = “[()]{}{[()()]()}” and 'not balanced' for exp = “[(])”
//amazon , snapdeal 
public class Parenthesis_Checker {
	public Parenthesis_Checker() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in = new Scanner(System.in);
     int test= in.nextInt();
     while(test>0)
     {       int L=0 , H=0 ;
    	 String data = in.nextLine();
        char data_arr[] = new char [data.length()];
        for(int i=0;i<data_arr.length;i++)
        {
        if(data.charAt(i)==data_arr[H])
        { 
        	if(L==H)
        		return;
        	else 
             H--;
        } else 
        {
           if(H==data_arr.length)
           {
        	   System.out.println("overflow");
              return;
           } else 
           {
        	   H=H+1;
           	data_arr[H]=data.charAt(i);   
           }
        	
        }
      if(L==H)
   	   System.out.println("balanced");
      else 
      	   System.out.println("not balanced");

        }
    	 test--;
     }
   in.close();
	}
 }
