package array;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in = new Scanner (System.in);
      String A = in.nextLine();
      String B = in.nextLine();
      String result = "";
      System.out.println("Output");
      permutation(A,B,result);
	}

	private static void permutation(String a, String b, String result) {
		// TODO Auto-generated method stub
		
		if(a.length()==0&&b.length()==0)
		{  
			System.out.println(result);
			return;
		}
		
		if(a.length()!=0)
			permutation(a.substring(1), b, result+a.charAt(0));
		if(b.length()!=0)
			permutation(a, b.substring(1), result+b.charAt(0));

			
	}

}
