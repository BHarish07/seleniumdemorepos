package javaTraining;

import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		/*
		 * int rev=0; while(num!=0) { rev=rev*10+num%10; num=num/10; }
		 */
		/*
		 * // using StringBuffer StringBuffer sb = new
		 * StringBuffer(String.valueOf(num)); StringBuffer rev = sb.reverse();
		 */
		
		StringBuilder sbl=new StringBuilder();
		 sbl.append(num);
		 StringBuilder rev = sbl.reverse();

		System.out.println("Reverse of the number is : " + rev);

	} 

}
