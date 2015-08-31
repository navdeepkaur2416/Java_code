package Java_code;

import java.util.Scanner;

import com.betasoft.assignment.PalindromeEx6;

public class GitHubSample {
	//Given an integer check if it is a Palindrome .
		public void chkPalindrome(){
			//int num=55455;
			 //extra comments hbjkbk
			System.out.print("Enter Number: "); 
			Scanner read = new Scanner(System.in);
		       int num = read.nextInt();
		       int n = num;//121
		       //reversing number
		       int rev=0,rmd; 
		       while(num > 0) //121>0
		       { 
		         rmd = num % 10; //121%10=1
		         rev = rev * 10 + rmd; //0*10+1=1
		         num = num / 10; //121/10
		       } 
		       if(rev == n) 
		         System.out.println(n+" is a Palindrome Number!"); 
		       else
		         System.out.println(n+" is not a Palindrome Number!"); 
		       read.close();
		     }
		public static void main(String[] args){
			PalindromeEx6 pal= new PalindromeEx6();
			pal.chkPalindrome();
		}
		

	/*//Check to see if the given String is palindrome or not
	public static void main(String args[])
	   {
	      String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to check if it is a palindrome");
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      if (original.equals(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string is not a palindrome.");
	 
	   }*/

}
