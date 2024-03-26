import java.io.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// all objects are cotained in shapelist
        Shape trg = new Triangle(3,4,5,4);
        Shape rtg = new Rectangle("Pink",3,4);
        Shape crc = new Circle("Green", 3);
        Shape sq = new Square("Yellow",5);

        ArrayList<Shape> shapelist = new ArrayList<>();

        shapelist.add(trg);
        shapelist.add(rtg);
        shapelist.add(crc);
        shapelist.add(sq);

        // Serializing the objects (shapelist)
        try {
            FileOutputStream fileOut = new FileOutputStream("shape.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(shapelist); // Serializing list contains all objects
            out.flush();
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/shape.ser");
            System.out.println(" ");
        } catch (IOException i) { //catch exception
            i.printStackTrace();
        }

        // deserialization of the objects
       try {
           FileInputStream fileIn = new FileInputStream("shape.ser");
           ObjectInputStream in = new ObjectInputStream(fileIn);
           ArrayList<Shape> s = (ArrayList<Shape>)in.readObject();
           for (Shape shape : s ){ // the loop for the deserialization of each object.
               System.out.println(" ");
               shape.Draw();
           }
           in.close();
           fileIn.close();
        } catch (IOException i) { //catch exception
            i.printStackTrace();
            return;
       } catch (ClassNotFoundException c) { //catch exception
           System.out.println("Shape class not found");
           c.printStackTrace();
           return;
      }





    }
}