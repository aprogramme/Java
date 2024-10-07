class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        // name = n;
        this.name = n;
    }
    public String getName(){
        return name;
    }

    public void setId(int i){
        // id = i;
        this.id = i;
    } 
    public int getId(){
        return id;
    }
}

class Circle{
    private double area;
    private double perimeter;

    public void setArea(int radius){
        area = 3.14*radius*radius;
    }
    public double getArea(){
        return area;
    }

    public void setPerimeter(int radius){
        perimeter = 2*3.14*radius;
    }
    public double getPerimeter(){
        return perimeter;
    }
}

public class A29_Access_Modifier {
    public static void main(String[] args){
        MyEmployee aayush = new MyEmployee();
        // aayush.id = 12;
        // aayush.name = "Aayush Raj"; --> throw an error due to private access modifier
        aayush.setName("Aayush Raj");
        System.out.println(aayush.getName());
        aayush.setId(01);
        System.out.println(aayush.getId());

        Circle cr = new Circle();
        // cr.radius = 23;
        // System.out.println(cr.radius);
        cr.setArea(3);
        System.out.println(cr.getArea());
        cr.setPerimeter(4);
        System.out.println(cr.getPerimeter());
    }
}