/**
 * 
 * 
1. The length of the OTP is exactly 8
2. The OTP starts with first two characters of the account type (Case sensitive)
3. The third character is first digit of the account number
4. The fourth character is the sum of first five digits of account number (if the sum exceeds single digit then sum of digits should be done to form a single digit.
Repeat if necessary)
5. The fifth character is the first character of the account holder’s name
6. The sixth character is the sum of sixth to tenth digit positions of the account
number (if the sum exceeds single digit then sum of digits should be done to
form a single digit. Repeat if necessary)
7. The seventh character is the last character of the account holder’s name
8. The eighth character is the last digit of the account number
9. All characters should be same case of the input string
 */
package matrix;
import java.util.*;
public class otp {
	public static Scanner sc;
	public static String output1;
	public static int t1=0;
	
	public static void main(String[] args) {
		sc= new Scanner(System.in);
		System.out.println("ENTER THE NAME OF THE USER :");
		String name=sc.nextLine();
		
		System.out.println("ENTER THE ACCOUNT NUMBER :");
		long Acc=sc.nextLong();
		long Ac=Acc;
		while(Ac!=0) {
			Ac/=10;
			t1++;
		}
		sc.nextLine();
		System.out.println("ENTER THE TYPE OF THE ACCOUNT :");
		String typeS=sc.nextLine();		
		userMethod(name, Acc, typeS ); 
		System.out.println( output1 ); 
	}
	public static void userMethod(String input1, long input2, String input3 ) {
		int n=input1.length();
		if(n>2) {
			System.out.println("test 1 pass");
		if(t1==11) {
			System.out.println("test 3 pass");
			if(input3.equals("Savings")||input3.equals("Current")||input3.equals("Loan")) {
				System.out.println("test 3 pass");
				
			}else {
				System.out.println("test 3 fails");
				System.out.println("[ERROR]-- the type you enter is not valid");
			}
			}
		else {
			System.out.println("test 2 fails");
			System.out.println("[ERROR]-- the account number is not equal to 11");
		}
		}else {
			System.out.println("test 1 fails");
			System.out.println("[ERROR]-- The name of the user is less than 2");
		}
		
		output1= "f";
		}

}
