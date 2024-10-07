class Phone{
    public void showTime(){
        System.out.println("Time is 8:24 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music in Smartphone...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}

public class A37_Dynamic_method_dispatch {
    public static void main(String[] args){
        // Phone obj = new Phone();  // Allowed
        // SmartPhone obj1 = new SmartPhone();  // Allowed
        // obj.name();

        // SmartPhone obj = new Phone();  // Not Allowed
        Phone obj = new SmartPhone();  // Allowed
        obj.showTime();
        obj.on();
        // obj.music();  // Not Allowed
    }
}