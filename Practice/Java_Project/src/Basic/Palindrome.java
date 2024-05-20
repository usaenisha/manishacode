package Basic;

public class Palindrome {

	public static void main(String[] args) {
		
		int a=121;
		int b=a;
		int sum=0;
		while(a>0)
		{
			int temp = a%10;
			sum=sum*10+temp;
			a= a/10;
		}
		if(sum==b)
		System.out.println("given number is palindrome");
		else
			System.out.println("given number is not palindrome");
	}

}
