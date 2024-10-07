// ----------------------------Q.No.1+2----------------------------
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}

// ----------------------------Q.No.3----------------------------
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello...");
    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleepng...");
    }
}

// ----------------------------Q.No.4----------------------------
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void dicsonnect();
}
class SmartPhone extends TelePhone{
    void camera(){
        System.out.println("Clicking Photo");
    }
    void ring(){
        System.out.println("Ringring Ring!");
    }
    void lift(){
        System.out.println("Lifting");
    }
    void dicsonnect(){
        System.out.println("Disconnecting...");
    }
}

// ----------------------------Q.No.6----------------------------
interface Tvremote{
    void volume();
    void channel();
}
interface SmartTvRemote extends Tvremote{
    void game();
    void internet();
}
class Tv implements SmartTvRemote{
    public void game(){
        System.out.println("Playing game");
    }
    public void internet(){
        System.out.println("Connecting internet...");
    }
    public void volume(){
        System.out.println("Volume up and down");
    }
    public void channel(){
        System.out.println("Changing channels");
    }
}

public class A45_Practice_Set11 {
    public static void main(String[] args){
        // Q1 + Q2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        // Q3
        Human hr = new Human();
        hr.sleep();

        // Q4
        TelePhone sp = new SmartPhone();
        sp.lift();
        sp.dicsonnect();
        // sp.camera(); --> error 

        SmartPhone s = new SmartPhone();
        s.camera();

        // Q5
        Monkey m = new Human();
        // m.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method 
        m.bite();
        m.jump();

        BasicAnimal b = new Human();
        // b.speak(); --> error
        b.eat();
        b.sleep();
    }
}