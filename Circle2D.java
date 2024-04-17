package HW5;

public class Circle2D {
    private double x = 0;
    private double y = 0;
    private double radius = 1;
    public Circle2D(){

    }
    
    public Circle2D (double yourX, double yourY, double yourRadius){
    this.x = yourX;
    this.y = yourY;
    this.radius = yourRadius;
   
    
    }public void setX(double newX){
        this.x = newX;
    
    }public void setY(double newY){
        this.y = newY;
    
    }public void setRadius(double newRadius){
        this.radius = newRadius;
    
    }public double getRadius(){
        return radius;

    }public double getX(){
        return x;
    
    }public double getY(){
        return y;
    
    }public double getArea(){
        double area = Math.PI * radius * radius;
        return area;

    }public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;

    }public boolean contains(double x, double y){
        boolean yes = false;
        if(Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2))<this.radius){
         yes = true;
        }return yes;

    }public boolean contains(Circle2D circle){
        boolean yes = false;
        if((Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2))< radius - this.radius)){
            yes = true;
        }return yes;
    }public boolean overlaps(Circle2D circle){
        boolean yes = false;
        if((Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2))< radius + this.radius)){
            yes = true;
        }return yes;
    }
    
    public String toString(){
        String st = "The area of the circle is: " + getArea() + "\n The perimeter of the circle is: " + getPerimeter() +
        "\n The result of c1.contains(3,3): " + contains(x,y);
        return st;
    }public String cString(){
        String c = "The result of c1.contains(new Circle2D(4,5,10.5)): ";
        return c;

    }public String oString(){
        String ol =  "The result of c1.overlaps(new Circle2D(3,5,2,3)): ";
        return ol;
    }

    }

