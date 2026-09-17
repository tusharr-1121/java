import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number :");
		
		if(!sc.hasNextDouble())
		{
			System.out.println("please enter double value ");
			return;
		}
        double d1 = sc.nextDouble();
        
    	
		System.out.println("Enter First number :");
		
		if(!sc.hasNextDouble())
		{
			System.out.println("please enter double value ");
			return;
		}
        double d2 = sc.nextDouble();
        
        double average = (d1+d2)/2;
        
        System.out.println("Average:"+average);
	}

}
