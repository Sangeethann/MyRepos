package sample;

public class StaticMethodEx {
	//Static method

	public static void main(String[] args) {
		StaticMethodEx.reverse(545);
	}
	
	public static void reverse(int n)
	{
	int n1=n;
	int rev=0;
	while(n>0)
	{
	int d=n%10;
	rev=rev*10+d;
	n=n/10;
	}
	StaticMethodEx.checkPalindrome(rev,n1);
	}
	public static void checkPalindrome(int rev, int n1)
	{
	if(rev==n1)
	{
	System.out.println("Number is palindrome");
	}
	else
	{
	System.out.println("Number is not palindrome");
	}
	}

}
