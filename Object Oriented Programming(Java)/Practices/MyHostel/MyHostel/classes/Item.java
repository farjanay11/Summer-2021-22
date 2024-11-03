package classes;

import interfaces.ItemActions;
import java.util.Scanner;

public class Item extends Calculation implements ItemActions {

    Scanner input = new Scanner(System.in);

    int choose;

    @Override
    public void menu() {
        // Shop Catalog or Menu List

        int again = 1;
        while (again != 0) {
            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println(" Bangla MENU ");
            System.out.println(" 1 : Rice, Tk: 45.00");
            System.out.println(" 2 : Fish Curry, Tk: 25.00");
            System.out.println(" 3 : Vegetable, Tk: 15.00");
            System.out.println(" 4 : Mutton, Tk: 50.00 ");
            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.print("Press you want to buy? : ");

            try {
                choose = input.nextInt();
                order(choose);
            } catch (Exception e) {
                System.out.println("Error: " + e);
                input.nextLine();
            }

            try {
                System.out.println("You Want to buy again ?");
                System.out.print("Press 1 for Yes or 0 for No : ");
                again = input.nextInt();
            } catch (Exception e) {
                System.out.println("Error: " + e);
                input.nextLine();
            }
        }

        payment();
        file.readFromFile();
    }

    @Override
    public void customerInformation() {
        String name, phone, ID;

        file.createAFile();

        System.out.print("Enter your name: ");
        name = input.nextLine();
        file.writeIntoFile("\nCustomer Name: " + name);

        System.out.print("Enter your phone numer: ");
        phone = input.nextLine();
        file.writeIntoFile("\nPhone Number: " + phone);

        System.out.print("Enter your ID: ");
        ID = input.nextLine();
        file.writeIntoFile("\nID Number: " + ID);
    }
}
