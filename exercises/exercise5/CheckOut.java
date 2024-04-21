import java.util.ArrayList;

// This class represents the checkout system for managing orders and calculating the total bill.
public class CheckOut {

    private ArrayList<String> orderList; // ArrayList to store the orders.
    private double TotalBill; // Variable to store the total bill.

    public CheckOut() { // initializes the orderList and sets the total bill to zero.
        orderList = new ArrayList<String>();
        TotalBill = 0.0;
    }

    public ArrayList<String> getOrderList(){
        return orderList;
    } // get order list

    public double getTotalBill(){
        return TotalBill;
    } // get the bill amount user needs to pay


    //Command Pattern
    public void addOrder(String n, int i){ // add order to the order list.
        int temp = 0;
        while (temp<i){
            orderList.add(n);
            temp++;
        }
    }

    //Command Pattern
    public void removeOrder(String n, int i){ // remove order from the order list.
        int temp = 0;
        while (temp<i){
            orderList.remove(n);
            temp++;
        }
    }

    public void calculateAddBill(double p, int q){ // calculate total price of the user's bill when user add food into his order.
        double currentPrice = p*q; //p: price of food, q: amount user add
        TotalBill = TotalBill+ currentPrice;
    }

    public void calculateRemoveBill(double p, int q){ // calculate total price of the user's bill when user remove food from his order.
        double currentPrice = p*q; // p: price of food, q: amount user remove
        TotalBill = TotalBill - currentPrice;
    }

    public boolean isOrderListEmpty(){
        if (orderList.size()==0){
            return true;  // Return true if the order list is empty, false otherwise.
        }else{
            return false;
        }
    }


}
