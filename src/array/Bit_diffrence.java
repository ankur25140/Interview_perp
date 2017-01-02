package array;

import java.util.Scanner;

public class Bit_diffrence {
	 public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      int test= in.nextInt();
      while(test>0)
      {
    	  int A = in.nextInt();
    	  int B = in.nextInt();
    	  System.out.println(Integer.bitCount(A^B));
    	  test--;
      }
	 }
}
