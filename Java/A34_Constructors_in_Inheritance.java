class Base{
    // Constructors
    Base(){
        System.out.println("I am a base class constructor");
    }
    Base(int x){
        System.out.println("I am an overloaded constructor of base with value of x as: " + x);
    }
    
}

class Derived extends Base{
    Derived(){
        // super(0);  // used to run constructor with argument
        System.out.println("I am a derived class constructor");
    }
    Derived(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);

    }
   
}

class childOfDerived extends Derived{
    childOfDerived(){
        System.out.println("I am child of derived constructor");
    }
    childOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of child of derived class with value of z as: " +  z);
    }
}

public class A34_Constructors_in_Inheritance {
    public static void main(String[] args){
        // Base b = new Base();
        // Derived d = new Derived();
        // Derived d = new Derived(14, 43);
        // childOfDerived cd = new childOfDerived();
        childOfDerived cd = new childOfDerived(1, 2, 3);

    }
}
