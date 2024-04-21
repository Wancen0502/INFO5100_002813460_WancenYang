import java.util.ArrayList;

public class Menu {  //Composite Pattern

     private ArrayList<Dish> dishList; // use array list to store dish objects.

    public Menu(){
        dishList = new ArrayList<Dish>();
    } //retrieve the menu

    public ArrayList<Dish> getMenu(){
        return dishList;
    } //add a dish to the menu.


    public void addDish(Dish d){
        dishList.add(d);
    }

    public void printMenu(){ // print menu information
        System.out.println("==========Menu==========");
        for (Dish d: dishList){
            String temp = d.getID();
            if (temp.contains("B")){
                System.out.println(d.getName() + " (Beverage) "); // print dish name
                System.out.println("Price: $"+d.getPrice()); // print dish price
                System.out.println("");
            }
            else{
                System.out.println(d.getName());
                System.out.println(d.getIntroduction());
                System.out.println("Price: $"+d.getPrice());
                System.out.println("");
            }
        }
    }


}
