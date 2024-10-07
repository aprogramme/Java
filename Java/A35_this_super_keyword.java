class EkClass{
    int a;

    public int getA(){
        return a;
    }
    EkClass(int a){
        this.a = a;
    }
    public int  returnone(){
        return 1;
    }
}

class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a contructor");
    }
}

public class A35_this_super_keyword {
    public static void main(String[] args){
        EkClass e = new EkClass(45);
        DoClass d = new DoClass(8);
        System.out.println(e.getA());
    }
}