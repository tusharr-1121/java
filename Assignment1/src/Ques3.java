import java.util.Scanner;

public class Ques3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int totalBill = 0;

        do {

            System.out.println("\n----- FOOD MENU -----");
            System.out.println("1. Dosa");
            System.out.println("2. Samosa");
            System.out.println("3. Idli");
            System.out.println("4. Vada Pav");
            System.out.println("5. PPP");
            System.out.println("6. QQQ");
            System.out.println("7. OOO");
            System.out.println("8. KKK");
            System.out.println("9. RRR ");
            System.out.println("10. Generate Bill");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 9) {

                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();

                int price = 0;

                switch (choice) {

                    case 1:
                        price = 10;
                        break;

                    case 2:
                        price = 20;
                        break;

                    case 3:
                        price = 30;
                        break;

                    case 4:
                        price = 10;
                        break;

                    case 5:
                        price = 30;
                        break;

                    case 6:
                        price = 40;
                        break;

                    case 7:
                        price = 10;
                        break;

                    case 8:
                        price = 10;
                        break;

                    case 9:
                        price = 10;
                        break;
                }

                totalBill = totalBill + (price * quantity);

            } 
            else if (choice == 10) {

                System.out.println("\nTotal Bill = Rs." + totalBill);
                break;

            } 
            else {

                System.out.println("Invalid choice!");

            }

        } while (true);

        sc.close();
    }
}

	

