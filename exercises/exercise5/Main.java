import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // create a menu
        Menu menu = new Menu();

        // create 11 dishes and add them to the menu
        Dish mc1 = new MainCourse("MC001","Spaghetti Carbonara","Classic Roman pasta dish with eggs, pecorino cheese, pancetta, and black pepper.",14.99);
        Dish mc2 = new MainCourse("MC002","Margherita Pizza","Traditional Neapolitan pizza topped with tomato sauce, fresh mozzarella cheese, basil, and a drizzle of olive oil.", 12.99);
        Dish mc3 = new MainCourse("MC003","Osso Buco","Milanese specialty featuring braised veal shanks cooked with vegetables, white wine, and broth, served with gremolata",26.99);
        Dish mc4 = new MainCourse("MC004", "Risotto ai Funghi","Creamy risotto cooked with porcini mushrooms, shallots, white wine, and finished with Parmigiano-Reggiano cheese",18.99);
        Dish mc5 = new MainCourse("MC005","Saltimbocca alla Romana ","Tender veal scallopini topped with prosciutto and sage, sautéed in a white wine and butter sauce. ",22.99);

        Dish d1 = new Desert("D001","Tiramisu","Iconic Italian dessert made with layers of espresso-soaked ladyfingers, mascarpone cheese, cocoa powder, and a touch of liqueur. ", 8.99);
        Dish d2 = new Desert("D002","Cannoli Siciliani", "Crispy pastry shells filled with sweet ricotta cheese, chocolate chips, and candied fruit, dusted with powdered sugar.",6.99);
        Dish d3 = new Desert("D003","Gelato","Silky smooth custard infused with vanilla bean, served with a berry compote or caramel sauce.", 4.99);
        
        Dish b1 = new Beverage("B001","Negroni",10.99);
        Dish b2 = new Beverage("B002","Prosecco",39.99);
        Dish b3 = new Beverage("B003","Limoncello",7.99);

        menu.addDish(mc1);
        menu.addDish(mc2);
        menu.addDish(mc3);
        menu.addDish(mc4);
        menu.addDish(mc5);

        menu.addDish(d1);
        menu.addDish(d2);
        menu.addDish(d3);

        menu.addDish(b1);
        menu.addDish(b2);
        menu.addDish(b3);

        Restaurant ItalianRestaurant = new Restaurant("Italian", menu); // create a new restaurant
        RestaurantOperate ro = new RestaurantOperate(ItalianRestaurant); // create a new restaurant operate.
        ro.operate();




        //The below code using for testing.
        // menu.printMenu();
       // CheckOut order = new CheckOut();
       // order.addOrder("a",3);
       // order.removeOrder("a",1);


        //for (String s: order.getOrderList() ){
           //System.out.println(s);
         // }



        }
    }
