package Basic;

public class Check_Prime_numbers {

	public static void main(String[] args) {
		System.out.println("check prime numbers");
		int i=14;
			boolean isprime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime)
			System.out.print(i+" is prime number");
			else
			System.out.println(i+" Not prime number");

	}

}
