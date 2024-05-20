package Basic;

public class Range_Prime_number {

	public static void main(String[] args) {
	
		
		//Find prime no in 2 to 20
		System.out.println("Print prime numbers");
		for(int i=2;i<=20;i++) {
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
			System.out.print(i+" ");
		}
	}

}
