import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static <Cupcake> void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        Cupcake cupcake = new Cupcake();

        RedVelvet redVelvet = new RedVelvet();

        Chocolate chocolate = new Chocolate();

        System.out.println(" Hello, we have three cupcake flavors.");

        Scanner input = new Scanner(System.in);
        int cupcakePrice1 = input.nextInt();
        int cupcakePrice2 = input.nextInt();
        int cupcakePrice3 = input.nextInt();

        cupcakeMenu.add = "Vanilla";
        cupcakeMenu.add = "Blueberry";
        cupcakeMenu.add = "Strawberry";

        ArrayList<String> drinkMenu = new ArrayList<String>();
        drinkMenu.add = "Milk";
        new Order(cupcakeMenu, drinkMenu);
        drinkMenu.add = "Coca Cola";
        drinkMenu.add = "Lemonade";

        new Order = (cupcakeMenu, drinkMenu);

        class Cupcake {
            private double price;
            public void type(){
                this.type = type();
            }
            public void setPrice(double price) {
                this.price = price;
            }
            public double getPrice() {
                return price;
            }
        }

        class RedVelvet extends Cupcake {

        }
        class Chocolate extends Cupcake {

        }
        class Drink {
            public double = price;
            public double getPrice () {
                return price;
            }
            public void setPrice(double price) {
                this.price = price;
        }
            public void type () {
                this.type = type();
            }
        }
        class Coca Cola extends Drink {

        }
        class Milk extends Drink {

        }
    }
}