public class Square extends Shape {

    // the Name will be shared by all object, which demonstrates the concept of static field.
    private static final String Name = "Square";

    private double Side;

    public Square(double a){
        Side = a;

    }

    public Square(String c, double a){
        super(c);
        Side = a;
    }

    // The code below demonstrates the concept of overriding.
    @Override
    public double Area(){
        double s = this.Side * this.Side;
        this.area = s;
        return s;
    }

    @Override
    public double Perimeter(){
        double l = Side * 4;
        this.perimeter = l;
        return l;

    }
    @Override
    public void Draw(){
        System.out.println("The shape is " + this.Name +"." );
        System.out.println("The color of the shape is " + getColor() +"." );
        System.out.println("The area of the shape is " + this.Area() + ".");
        System.out.println("The perimeter of the shape is " + this.Perimeter() + ".");

    }


}
