import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		String pal = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			pal += str.charAt(i);
			
		}
		
		if(str.equals(pal))
		{
			System.out.println("String is palidrome");
		}
		else
		{
			System.out.println("String is not palidrome");
		}
	}

}
