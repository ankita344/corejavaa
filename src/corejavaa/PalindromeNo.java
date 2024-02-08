package corejavaa;
import java.util.Scanner;
public class PalindromeNo {
public static void main (String[]args) {
	System.out.println("enter a no:");
	Scanner sc =new Scanner(System.in);
	int num=sc.nextInt();
	int rev=0;
	int org_num=num;
	while(num!=0) {
		rev=rev*10+ num%10;
		num=num/10;
		if(org_num==rev) {
			System.out.println(org_num +"palindrome no");
		}
		else {
			System.out.println(org_num +" is not a palindrome no");
		}
	}
}
}
