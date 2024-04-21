import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Restaurant {

    private String restaurantName;
    private Menu restaurantMenu;
    private CheckOut checkOut;

    public Restaurant(String rn, Menu m){
        restaurantName = rn;
        restaurantMenu = m;
        checkOut = new CheckOut();
    }

    public void setCheckOut(CheckOut c){
        checkOut = c;
    }

    public void restaurantWelcome(){ // The welcome page of the system.
        System.out.println("Welcome to " + restaurantName +" restaurant!");
        System.out.println(" ");
        System.out.println("What do you need today:");
        System.out.println("1.View the menu.");
        System.out.println("2.Order your food.");
        System.out.println("3.Remove food from your order.");
        System.out.println("4.View your order.");
        System.out.println("5.Check out your bill.");
        System.out.println("6.Exit the order System.");
        System.out.println(" ");
    }


    public void viewMenu(){
            restaurantMenu.printMenu();
    } // view menu function.

    public void orderFood(String fn, String q) { // the method of order food
        try{
            boolean Check = false; // to check if the food user want is on the menu.
            String check = fn.toLowerCase(Locale.ROOT);
            double dishPrice = 0;
            //System.out.println(check);
            for (Dish d: restaurantMenu.getMenu()) { // loop for view the restaurant menu.
                if (d.getName().toLowerCase().equals(check)) {
                    dishPrice = d.getPrice();
                    int temp = Integer.parseInt(q);
                    checkOut.addOrder(fn, temp); // Add the order to the checkout system.
                    checkOut.calculateAddBill(dishPrice,temp); // Calculate the bill.
                    System.out.println(q + " " + fn + "have been added to your order!");
                    Check = true;
                }
            }
            if (!Check){
                System.out.println("Sorry,we can't find the food you want on our menu.");
                System.out.println(" ");
            }
            } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void removeFood(String fn, String q){
        try{
            double price = 0;
            int amount = 0;
            int removeAmounts = Integer.parseInt(q); // amounts of food the user want to remove.
            String foodname = fn.toLowerCase(Locale.ROOT);
            for (String s: checkOut.getOrderList()) { // Count how many instances of the specified food are present in the order.
                if (s.toLowerCase().equals(foodname)) {
                    amount+=1;
                }
            }
            if(amount < removeAmounts){ // Check if the quantity of food to be removed exceeds the quantity in the order.
                System.out.println("Sorry, we are unable to remove the dish on your order. ");
                return;
            }
            for (String s: checkOut.getOrderList()){ // Find the corresponding dish in the menu to retrieve its price.
                if (s.toLowerCase().equals(foodname)){ // If the quantity to be removed is valid, proceed to remove it from the order list.
                    checkOut.removeOrder(fn,removeAmounts); // Remove the order from the checkout system.
                    for (Dish d: restaurantMenu.getMenu()) {
                        if (d.getName().toLowerCase().equals(foodname)) {
                            price = d.getPrice();
                            checkOut.calculateRemoveBill(price,removeAmounts); // Calculate the reduction in the bill.
                            break;
                        }
                }
                    System.out.println(q+" "+fn+" has been removed from your order. ");
                    break;
            }else{
                    System.out.println("Sorry, we are unable to remove the dish on your order. ");
                }
            }
            }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void viewOrder(){ // view what food has been ordered
        ArrayList<String> orderList = checkOut.getOrderList();
        System.out.println("Here is your order list:");
        for (String s: orderList){
            System.out.println(s);
        }

    }

    public double Checkbill(){ // check the bill the user needs to pay
        DecimalFormat df = new DecimalFormat("#.##");
        String ans = df.format(checkOut.getTotalBill());
        System.out.println("Your total bill is: "+ ans);
        return checkOut.getTotalBill();
    }

    public boolean isCheck(){
        return checkOut.isOrderListEmpty();
    }

    public CheckOut getCheckOut() {
        return checkOut;
    }
}
