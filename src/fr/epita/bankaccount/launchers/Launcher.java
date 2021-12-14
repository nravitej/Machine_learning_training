package fr.epita.bankaccount.launchers;

import java.util.Scanner;

import fr.epita.bankaccount.datamodel.Customer;

public class Launcher {

    public static void main(String[] args) {
        System.out.println("Beginning of the application");

        System.out.println("Please enter customer name:");
        Scanner scanner = new Scanner(System.in);
        String customerName = scanner.nextLine();

        System.out.println("Please enter customer address:");
        String customerAddress = scanner.nextLine();

        Customer customer = new Customer();
        customer.setName(customerName);
        customer.setAddress(customerAddress);

        System.out.println(customer);







    }

}
