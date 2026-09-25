package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basket size: ");
        int n = sc.nextInt();

        Fruit[] basket = new Fruit[n];

        int counter = 0;

        int choice;

        do {
            System.out.println("\n----- FRUIT BASKET -----");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango");
            System.out.println("2. Add Orange");
            System.out.println("3. Add Apple");
            System.out.println("4. Display names of all fruits");
            System.out.println("5. Display details of all fresh fruits");
            System.out.println("6. Display tastes of stale fruits");
            System.out.println("7. Mark a fruit as stale");
            System.out.println("8. Mark all sour fruits stale");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 0:
                    System.out.println("Exiting...");
                    break;

                case 1:
                    if (counter >= basket.length) {
                        System.out.println("Basket is full!");
                        break;
                    }

                    System.out.print("Enter mango name: ");
                    String mn = sc.next();

                    System.out.print("Enter weight: ");
                    double mw = sc.nextDouble();

                    System.out.print("Enter color: ");
                    String mc = sc.next();

                    basket[counter++] = new Mango(mn, mw, mc);

                    System.out.println("Mango added successfully.");
                    break;

                case 2:
                    if (counter >= basket.length) {
                        System.out.println("Basket is full!");
                        break;
                    }

                    System.out.print("Enter orange name: ");
                    String on = sc.next();

                    System.out.print("Enter weight: ");
                    double ow = sc.nextDouble();

                    System.out.print("Enter color: ");
                    String oc = sc.next();

                    basket[counter++] = new Orange(on, ow, oc);

                    System.out.println("Orange added successfully.");
                    break;

                case 3:
                    if (counter >= basket.length) {
                        System.out.println("Basket is full!");
                        break;
                    }
                   
                  
                    System.out.print("Enter apple name: ");
                    String an = sc.next();

                    System.out.print("Enter weight: ");
                    double aw = sc.nextDouble();

                    System.out.print("Enter color: ");
                    String ac = sc.next();
                    
                  

                    basket[counter++] = new Apple(an, aw, ac);

                    System.out.println("Apple added successfully.");
                    break;

                case 4:
                    System.out.println("\n--- Fruit Names ---");

                    for (Fruit fruit : basket) {

                        if (fruit != null) {
                            System.out.println(fruit.getName());
                        }
                    }

                    break;

                case 5:
                    System.out.println("\n--- Fresh Fruits ---");

                    for (Fruit fruit : basket) {

                        if (fruit != null && fruit.isFresh()) {

                            System.out.println(fruit);
                            System.out.println("Taste: " + fruit.taste());
                        }
                    }

                    break;

                case 6:
                    System.out.println("\n--- Stale Fruits ---");

                    for (Fruit fruit : basket) {

                        if (fruit != null && !fruit.isFresh()) {

                            System.out.println(
                                fruit.getName() +
                                " : " +
                                fruit.taste()
                            );
                        }
                    }

                    break;

                case 7:
                    System.out.print("Enter fruit index: ");
                    int index = sc.nextInt();

                    if (index < 0 || index >= basket.length) {

                        System.out.println("Invalid index!");

                    } else if (basket[index] == null) {

                        System.out.println("No fruit at this index!");

                    } else {

                        basket[index].setFresh(false);

                        System.out.println(
                            basket[index].getName() +
                            " marked as stale."
                        );
                    }

                    break;

                case 8:
                    System.out.println("\n--- Marking Sour Fruits Stale ---");

                    for (Fruit fruit : basket) {

                        if (fruit != null &&
                            fruit.taste().equals("sour")) {

                            fruit.setFresh(false);
                        }
                    }

                    System.out.println("All sour fruits marked stale.");

                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}