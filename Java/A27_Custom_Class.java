class Employee{
   int id;
   String name;
   int salary;

   public void  printDetails(){
    System.out.println("My id is " + id);
    System.out.println("and name is " + name);
   }

   public int getSalary(){
    return salary;
   }
}

public class A27_Custom_Class {
    public static void main(String[] args){
        System.out.println("This is our custom class");
        Employee aayush = new Employee(); // Instantiating a new Employee Object
        Employee harry = new Employee();
        // Setting Attributes for aayush
        aayush.id = 01;
        aayush.name = "Aayush Raj";

        // Setting Attributes for harry
        harry.id = 02;
        harry.salary = 30;
        harry.name = "Haris";

        // Printing the Attributes 
        aayush.printDetails();
        harry.printDetails();
        int salary = harry.getSalary();
        System.out.println(salary);
        // System.out.println(aayush.id);
        // System.out.println(aayush.name);
    }
}