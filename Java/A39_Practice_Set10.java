class Circle{
    public int radius;
    Circle(){
        System.out.println("I am circle without parameter");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;
    Cylinder(int r, int h){
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*height;
    }
}

class Rectangle{
    int length;
    int breadth;
    Rectangle(){
        System.out.println("I am rectangle without parameter");
    }
    Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
        System.out.println("I am rectangle parameterized constructor");
    }
    public int area(){
        return this.length*this.breadth;
    }
}
class Cuboid extends Rectangle{
    int height;
    Cuboid(int l, int b, int h){
        super(l, h);
        this.height = h;
        System.out.println("I am cuboid parameterized constructor");
    }
    public int volume(){
        return this.length*this.breadth*height;
    }
}

public class A39_Practice_Set10 {
    public static void main(String[] args){
        // ----------------------------------Q.No.1----------------------------------
        // Circle obj = new Circle(12);
        // Cylinder obj = new Cylinder(12, 4);

        // ----------------------------------Q.No.2----------------------------------
        // Rectangle rec = new Rectangle(8, 5);
        Cuboid cu = new Cuboid(8, 5, 5);
    }
}