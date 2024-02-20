public class Rectangle extends Shape {

    // the Name will be shared by all object, which demonstrates the concept of static field.
    private static final String Name = "Rectangle";

    private double Side1;

    private double Side2;


    public Rectangle(double a, double b){
        Side1 = a;
        Side2 = b;

    }

    public Rectangle(String c, double a, double b){
        super(c);
        Side1 = a;
        Side2 = b;
    }

    // The code below demonstrates the concept of overriding.
    @Override
    public double Area(){
        double s = Side1 * Side2;
        this.area = s;
        return s;
    }

    @Override
    public double Perimeter(){
        double l = (Side1 + Side2 ) * 2 ;
        this.perimeter = l;
        return l;

    }
    @Override
    public  void Draw(){
        System.out.println("The shape is " + this.Name +"." );
        System.out.println("The color of the shape is " + getColor() +"." );
        System.out.println("The area of the shape is " + String.format("%.2f",Area()) + ".");
        System.out.println("The perimeter of the shape is " + String.format("%.2f",Perimeter() )+ ".");

    }


}
