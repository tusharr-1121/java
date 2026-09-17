import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
	
		int num;
		Scanner sc = new Scanner(System.in);
	
		num = sc.nextInt();
		System.out.println("Enter Number :"+num);
		System.out.println("Given Number :"+num);
		 
		 String binary = Integer.toBinaryString(num);
          String octal= Integer.toOctalString(num);	
           String hex= Integer.toHexString(num);
           
           System.out.println("Binary equivalent :"+binary);
           System.out.println("Octal equivalent :"+octal);
           System.out.println("Hexadecimal equivalent :"+hex);

	}

}
