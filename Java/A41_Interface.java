interface Bicycle{
    int a = 35;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface hornBicycle{
    void horn07();
    void horn90();
}

class AvonCycle implements Bicycle, hornBicycle{
    void blowHorn(){
        System.out.println("Pee pee");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("Apply speed");
    }
    public void horn07(){
        System.out.println("Bloww hornn");
    }
    public void horn90(){
        System.out.println("Blowing horn");
    }
}

public class A41_Interface {
    public static void main(String[] args){
        AvonCycle cycle1 = new AvonCycle();
        cycle1.applyBrake(1);
        // You can create properties in interfaces  
        System.out.println(cycle1.a); 

        // You cannot modify the properties in interfaces as they are final  
        // cycle1.a = 56;
        // System.out.println(cycle1.a);

        cycle1.horn07();
        cycle1.horn90();;
    }
}