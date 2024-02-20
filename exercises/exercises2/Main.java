import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // create 4 children classes and add them into an ArrayList<Shape>

        ArrayList<Shape> sl= new ArrayList<>();

        Triangle trg = new Triangle(3,4,5,4);
        Rectangle rtg = new Rectangle("Pink",3,4);
        Circle crc = new Circle("Green", 3);
        Square sq = new Square("Yellow",5);

        sl.add(trg);
        sl.add(rtg);
        sl.add(crc);
        sl.add(sq);

        // The below for loop demonstrate the concept of polymorphism.
        for(Shape s : sl){
            s.Draw(); // implement specific instruct of Draw() in different children classes.
            System.out.println();
        }

    }
}