class MyEmployee{
    private int id;
    private String name;
    private int salary;

    // Constructor 
    public MyEmployee(){
        id = 45;
        name = "Your name here";
    }
    public MyEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }

    public MyEmployee(int n){
        salary = n; 
    }

    public int getSalary(){
        return salary;
    }

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

public class A31_Constructor {
    public static void main(String[] args){
        // MyEmployee aayush = new MyEmployee();
        // MyEmployee aayush = new MyEmployee("Programming With harry",2104459);
        MyEmployee aayush = new MyEmployee(30000);
        // aayush.setName("Aayush Raj");
        // aayush.setId(01);
        System.out.println(aayush.getName());
        System.out.println(aayush.getId());
        System.out.println(aayush.getSalary());

    }
}