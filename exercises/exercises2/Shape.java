//Shape is the abstract class, which demonstrates the concept of abstraction.
public abstract class Shape {

    // the Name and default Color will share by all object, which demonstrates the concept of static field.
    private static String Name = "Shape";
    protected static final String defaultColor = "Black";
    protected String color;
    protected double area;
    protected double perimeter;


    public Shape() {
    }

    public Shape(String c){
        this.color = c;
    }

    public void SetColor(String c){
        this.color = c;
    }

    public String getDefaultColor(){
        return this.defaultColor;
    }

    public String getColor(){
       String ans = "null";
       if (color != null){
           ans = color;
       }
       else{
           ans = this.defaultColor;
       }
        return ans;
    }

// Here below are three abstract methods.
    public abstract double Area();

    public abstract double Perimeter();

    public abstract void Draw();

}

