package HW5;


public class Circle2DTest{
    public static void main (String[] args){
    Circle2D c1 = new Circle2D(2,2,5.5);
    Circle2D cCont = new Circle2D(4,5,10.5);
    Circle2D circleO = new Circle2D(3,5,2.3);
        System.out.println(c1.toString());
         System.out.print(cCont.cString());
         System.out.println(c1.contains(cCont));
         System.out.print(c1.oString());
        System.out.print(c1.overlaps(circleO));
    
    }
}
