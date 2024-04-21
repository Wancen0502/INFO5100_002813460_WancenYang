public class Dish { //use of factory pattern

    protected String DishId;
    protected String Name;
    protected String Introduction;
    protected double price;

    public Dish(String id, String n, String intro, double p){ // create new dish
        DishId = id;
        Name = n;
        Introduction = intro;
        price = p;
    }

    public Dish(String id, String n, double p) {
        DishId = id;
        Name = n;
        price = p;
    }

    public String getID(){
        return this.DishId;
        }

    public String getName(){
        return this.Name;
        }

    public String getIntroduction(){
        return this.Introduction;
    }

    public double getPrice(){
        return this.price;
    }

}
