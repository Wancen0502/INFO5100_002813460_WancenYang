import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.round;

// This class represents the operations for managing the restaurant.
public class RestaurantOperate {

    private Restaurant restaurant; // Reference to the Restaurant object

    private Scanner sc;

    private boolean isPay; // check if the user has already pay for his bill (if the user order something).

    private boolean exitCode; // system control.
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public RestaurantOperate(Restaurant r){ // Initializes the RestaurantOperate object with a Restaurant instance.
       restaurant = r; // Assign the Restaurant object.
       sc = new Scanner(System.in);
       isPay = true;
       exitCode = false;

    }


    // Method to operate the restaurant system.
    public void operate(){
        while (!exitCode){
            restaurant.restaurantWelcome();
            String control = sc.next();
            if (control.equals("1")){
                restaurant.viewMenu();
            }
            if (control.equals("2")){
                sc.nextLine();
                System.out.println("Please order the food you want: (you need to enter the food name)");
                String temp0 = sc.nextLine();
                System.out.println("How many quantity you want: ");
                String temp1 = sc.next();
                try {
                    restaurant.orderFood(temp0, temp1);
                    if (restaurant.isCheck()==false) {
                        isPay = false;
                    }

                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if (control.equals("3")){
                sc.nextLine();
                System.out.println("The food you want to remove from your order is:");
                String temp0 = sc.nextLine();
                System.out.println("How many quantity you want to remove: ");
                String temp1 = sc.next();
                try {
                    restaurant.removeFood(temp0, temp1);
                    if (restaurant.isCheck()!=false){
                        isPay = true;

                    }
                } catch(Exception e){
                    e.printStackTrace();
                    System.out.println("It seems something is going wrong, you can check your order and try again. ");
                }
            }
            if (control.equals("4")){
                restaurant.viewOrder();
            }
            if (control.equals("5")){
                sc.nextLine();
                    String pay = String.valueOf(df.format(restaurant.Checkbill()));
                    System.out.println(pay);
                while (isPay != true) {
                    System.out.println("Please enter the amounts of your bill:");
                    control = sc.next();
                    if (control.equals(pay)) { // check if the user pay the bill correctly.
                        System.out.println("Thanks for paying your bill!");
                        isPay = true;
                        restaurant.setCheckOut(new CheckOut());

                    } else {
                        System.out.println("It seems something going wrong, please try again.");
                    }
                }
            }
            if (control.equals("6")){
                if (isPay == true){ // if the user has already paid his bill.
                    exitCode = true; // then the user can exit the system successfully.
                }else{
                    System.out.println("Sorry, you need to your bill first.");
                }
            }

        }
        System.out.println("Thanks for coming to the restaurant, have a great day!");


    }

}
