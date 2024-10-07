class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vidrate(){
        System.out.println("Virbrating...");
    }
    public void callFriend(){
        System.out.println("Calling...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Tommy hitting the enemy");
    }
    public void run(){
        System.out.println("Tommy running from the enemy");
    }
    public void fire(){
        System.out.println("Tommy firing on the enemy");
    }
}

class Circle{
    int radius;
    public float area(){
        return (float)(3.14)*(radius*radius);
    }
    public float perimeter(){
        return (float)(3.14)*(2*radius);
    }
}

public class A28_Practice_Set8 {
    public static void main(String[] args){
        // -------------------------------Q.No.1-------------------------------
        /* 
        Employee aayush = new Employee();
        aayush.setName("CodeWithAayush");
        System.out.println(aayush.getName());
        aayush.salary = 200000;
        System.out.println(aayush.getSalary());
        */

        // -------------------------------Q.No.2-------------------------------
        /* 
        CellPhone samsung = new CellPhone();
        samsung.ring();
        samsung.vidrate();
        samsung.callFriend();
        */

        // -------------------------------Q.No.3-------------------------------
        /* 
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        */

        // -------------------------------Q.No.4-------------------------------
        /* 
        Rectangle rec = new Rectangle();
        rec.length = 4;
        rec.breadth = 5;
        System.out.println("The area of rectangle is: " + rec.area());
        System.out.println("The perimeter of rectangle is: " + rec.perimeter());
        */

        // -------------------------------Q.No.5-------------------------------
        /*
        Tommy t = new Tommy();
        t.hit();
        t.fire();
        t.run();
        */

        // -------------------------------Q.No.6-------------------------------
        Circle c = new Circle();
        c.radius = 5;
        System.out.println("The area of cirlce is:" + c.area());
        System.out.println("The perimeter of cirlce is:" + c.perimeter());

    }
}

