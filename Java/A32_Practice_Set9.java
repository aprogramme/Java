class Cylinder{
    private int radius;
    private int height;

    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }

    public void setHeight(int h){
        height = h;
    }
    public int getHeight(){
        return height;
    }

    public double surfaceArea(){
        // return (2 * 3.14 * radius * radius) + (2 * 3.14 * radius * height);
        return (2 * Math.PI * radius * radius) + (2 * 3.14 * radius * height);
    } 

    public double volume(){
        // return 3.14 * radius * radius * height;
        return Math.PI * radius * radius * height;
    }

    // Constructor 
    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}

class Sphere{
    private int radius;

    public void setRadius(int r){
        radius = r;
    }
    public int getRadius(){
        return radius;
    }

    public double area(){
        return 4 * Math.PI * radius * radius;
    }

    public double volume(){
        return (4 * Math.PI * radius * radius * radius)/3;
    }
}

public class A32_Practice_Set9 {
    public static void main(String[] args){
        // -----------------------------Q.No.1-----------------------------
        /*
        Cylinder cy = new Cylinder();
        cy.setRadius(10);
        System.out.println(cy.getRadius());
        cy.setHeight(25);
        System.out.println(cy.getHeight());
        */

        // -----------------------------Q.No.2-----------------------------
        /*
        Cylinder cy = new Cylinder();
        cy.setRadius(10);
        System.out.println(cy.getRadius());
        cy.setHeight(25);
        System.out.println(cy.getHeight());
        System.out.println(cy.surfaceArea());
        System.out.println(cy.volume());
         */

        // -----------------------------Q.No.3-----------------------------
        /* 
        Cylinder cy = new Cylinder(10, 25);
        System.out.println(cy.getHeight());
        System.out.println(cy.getRadius());
        System.out.println(cy.surfaceArea());
        System.out.println(cy.volume());
        */

        // -----------------------------Q.No.4-----------------------------
        /* 
        // Rectangle rec = new Rectangle();
        Rectangle rec = new Rectangle(12, 25);
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
        */

        
        // -----------------------------Q.No.5-----------------------------
        Sphere sp = new Sphere();
        sp.setRadius(4);
        System.out.println(sp.getRadius());
        System.out.println(sp.area());
        System.out.println(sp.volume());

    }

}
