package clients;

import java.util.Scanner;

public class ClientService {

    Scanner scan = new Scanner(System.in);

    public void hello() {
        System.out.println("Hello!");

        boolean running = true;

        while (running) {
            System.out.println("Choose what you want to do: ");
            System.out.println("1. Register a new customer.");
            System.out.println("2. Register a new visit on a existing customer.");
            int answer = scan.nextInt();
            scan.nextLine();

            switch (answer) {
                case 1:
                    registerClient();
                    break;
                case 2:
                    registerVisit();
                    break;
            }
        }
    }

    public void registerClient() {
        System.out.println("Name: ");
        scan.nextLine();
        System.out.println("Adress: ");
        scan.nextLine();
        System.out.println("Customer is registered!");
    }

    public void registerVisit() {
        System.out.println("Type: ");
        scan.nextLine();
        System.out.println("Startingtime: ");
        scan.nextInt();
        System.out.println("Length: ");
        scan.nextInt();
        scan.next(); //WS reducer??
        System.out.println("Visit is registered!");

    }

}
