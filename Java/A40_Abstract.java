abstract class Parent{
    public Parent(){
        System.out.println("I am a base class constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}

public class A40_Abstract {
    public static void main(String[] args){
        // Parent p = new Parent();  // --> Not allowed
        Child c = new Child();
        c.greet();
        // Child2 c2 = new Child2();  // --> Not allowed
    }
}