import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.time.LocalTime;
import java.time.LocalDate;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Order {
//    String cupcakeMenu;
//    String drinkMenu;

    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        System.out.println("Hi! Would you like to place an order? (Y or N)");

        Scanner input = new Scanner(System.in);

        String takeOrder = input.nextLine();

        ArrayList<Object> order = new ArrayList<Object>();

        if(takeOrder.ignoreCase ("Y"))
        {
            order.add(LocalDate.now());
            order.add(LocalTime.now());

            for (int i=0; i < cupcakeMenu.size(); i++){
                System.out.println("Here is the menu" + cupcakeMenu.get(i));

                itemNumber++;

                System.out.print(itemNumber + ".");

                cupcakeMenu.get(i).type();

                System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());
            }
            for (int i=0; i < drinkMenu.size(); i++){
                System.out.println("Here is the menu" + drinkMenu.get(i));

                itemNumber++;

                System.out.print(itemNumber + ".");

                drinkMenu.get(i).type();

                System.out.println("Price: $" + drinkMenu.get(i).getPrice());
            }
            boolean userOrder = true;

            while (userOrder) {
                System.out.println("What would you like to order?");

                int orderItem = input.nextInt();

                input.nextLine();

                if (orderItem == 1) {

                    order.add(cupcakeMenu.get(0));

                    System.out.println("Item added to order");
                } else if (orderItem == 2) {

                    order.add(cupcakeMenu.get(1));

                    System.out.println("Item added to order");
                }else if (orderItem == 3) {

                    order.add(cupcakeMenu.get(2));

                    System.out.println("Item added to order");
                }else if (orderItem == 4) {

                    order.add(drinkMenu.get(0));

                    System.out.println("Item added to order");
                }else if (orderItem == 5) {

                    order.add(drinkMenu.get(1));

                    System.out.println("Item added to order");
                }else if (orderItem == 6) {

                    order.add(drinkMenu.get(2));

                    System.out.println("Item added to order");
                } else {
                    System.out.println("There are no other items on the menu.");
                }
                System.out.println("Would you like to add onto your order (Y/N)?");

                String orderAddOn = input.nextLine();

                if (!orderAddOn.equalsIgnoreCase("Y"))
                {
                    ordering = false;
                }
            }
            System.out.println(order.get(0));
            System.out.println(order.get(1));

            Double subtotal = 0.0;

            for (int i=2; i < order.size(); i++) {
                if (order.get(i).equals(cupcakeMenu.get(0)))
                {
                    cupcakeMenu.get(0).type();

                    System.out.println((cupcakeMenu.get(0).getPrice()));

                    subtotal = subtotal + cupcakeMenu.get(0).getPrice();
                } else if (order.get(i).equals(cupcakeMenu.get(2))) {
                    cupcakeMenu.get(2).type();

                    System.out.println((cupcakeMenu.get(2).getPrice()));

                    subtotal = subtotal + cupcakeMenu.get(2).getPrice();
                } else if (order.get(i).equals(drinkMenu.get(1))) {
                    drinkMenu.get(1).type();

                    System.out.println(drinkMenu.get(1).getPrice());

                    subtotal = subtotal +drinkMenu.get(1).getPrice();
                } else if (order.get(i).equals(drinkMenu.get(2))) {
                    drinkMenu.get(2).type();

                    System.out.println(drinkMenu.get(2).getPrice());

                    subtotal =subtotal +drinkMenu.get(2).getPrice();
                }
            }
            System.out.println("s" + subtotal);

            new CreateFile();
            new WriteToFile(order);
        } else{
            System.out.println("Thank you");
        }
    }
}
class CreateFile
{
    public CreateFile() {
        try {
            File salesData = new File("salesData.txt");

            if (salesData.createNewFile()) {
                System.out.println("File created :" + salesData.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

class WriteFile {
    public WriteFile(ArrayList<Object> order){
        try {
            FileWriter fw = new FileWriter("salesData.txt", true);
            printWriter salesWriter = new PrintWriter(fw);

            for (int i = 0; i < order.size(); i++) {
                salesWriter.println(order.get(i));
            }
            salesWriter.close();
            System.out.println("File successfully written");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}