public class Triangle extends Shape {

    // the Name will be shared by all object, which demonstrates the concept of static field.
    private static final String Name = "Triangle";

    private double Sideb;

    private double Side2;

    private double Side3;

    private double Height;

    public Triangle(double sb, double s2,double s3, double h ){
        Sideb = sb;
        Side2 = s2;
        Side3 = s3;
        Height = h;

    }

    public Triangle(String c, double sb ,double s2,double s3, double h ){
        super(c);
        Sideb = sb;
        Side2 = s2;
        Side3 = s3;

    }



    public double Area(){
        double s = Height * Sideb * 0.5;
        this.area = s;
        return s;
    }

    // The code below demonstrates the concept of overriding.
    @Override
    public double Perimeter(){
        double l = Sideb + Side2 + Side3 ;
        this.perimeter = l;
        return l;

    }
    @Override
    public void Draw(){
        System.out.println("The shape is " + this.Name +"." );
        System.out.println("The color of the shape is " + getColor() +"." );
        System.out.println("The area of the shape is " + String.format("%.2f", this.Area() )+ ".");
        System.out.println("The perimeter of the shape is " + String.format("%.2f",this.Perimeter()) + ".");

    }
}
