public class Circle extends Shape {

    // the Name will be shared by all object, which demonstrates the concept of static field.
    private static final String Name = "Circle";
    private double Radius;

    public Circle(double r){
        this.Radius = r;
    }

    public Circle(String c, double r){
        super(c);
        this.Radius = r;
    }

    public double SetRadius(double r ){
        return this.Radius = r;
    }



    // The code below demonstrates the concept of overriding.
    @Override
    public double Area(){
        double s = Math.PI*this.Radius*this.Radius;
        this.area = s;
        return s;
    }

    @Override
    public double Perimeter(){
        double l = Math.PI*this.Radius * 2 ;
        this.perimeter = l;
        return l;

    }
    @Override
    public void Draw(){
        System.out.println("The shape is " + this.Name +"." );
        System.out.println("The color of the shape is " + getColor() +"." );
        System.out.println("The area of the shape is " + String.format("%.2f",this.Area()) + ".");
        System.out.println("The perimeter of the shape is " + String.format("%.2f",this.Perimeter()) + ".");

    }


}

