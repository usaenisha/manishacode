package Basic;

public class Fibonacci_series {

	
	public static void main(String[] args) {
		System.out.println("Print Fibonacci series");
		int a=0,b=1;
		System.out.print(a+" "+b);
		for(int i=1;i<10;i++) {
		int c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		
		}
        
	}

}
