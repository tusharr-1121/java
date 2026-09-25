import java.util.Scanner;

public class DailyDrivingCost {

	
	private int totalMilesPerDay;
	private double costPerGallon;
	private double avgMiles;
	private double parkFee;
	private int tollsPerDay;
	Scanner sc = new Scanner(System.in);
	
	double total = totalMilesPerDay/avgMiles;
	double gasolineCost = total*costPerGallon;
	
	
	DailyDrivingCost(){}
	
	public DailyDrivingCost(int totalMilesPerDay, double costPerGallon, double avgMiles, double parkFee,
			int tollsPerDay) {
	
		this.totalMilesPerDay = totalMilesPerDay;
		this.costPerGallon = costPerGallon;
		this.avgMiles = avgMiles;
		this.parkFee = parkFee;
		this.tollsPerDay = tollsPerDay;
	}
	
	public void acceptdata()
	{
		System.out.println("Enter total Mile :");
		this.totalMilesPerDay = sc.nextInt();
		
		System.out.println("Enter the cost per gallon :");
		this.costPerGallon = sc.nextDouble();
		
		System.out.println("Enter the avgerage miles :");
		this.avgMiles = sc.nextDouble();
		
		System.out.println("Enter the park fee :");
		this.parkFee = sc.nextDouble();
		
		System.out.println("Enter the tools per day :");
		this.tollsPerDay = sc.nextInt();
		
	}
	
	public double displayTotalCostPerDay()
	{
		return gasolineCost+parkFee+tollsPerDay;
		
	}
				
	
	
	
	
}
