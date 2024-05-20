package String_Array;

public class reverse_of_word {

	public static void main(String[] args) {
		
		String s ="My name is Khan";
		String[] split = s.split(" ");
		
		for(int i=split.length-1;i>=0;i--)
		{
			System.out.print(split[i]+" ");
		}

	}

}
