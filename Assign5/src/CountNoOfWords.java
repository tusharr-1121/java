import java.util.Scanner;

public class CountNoOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine().trim();
		String [] split = str.split(" ");
		System.out.println(split.length);
	
	}

}
