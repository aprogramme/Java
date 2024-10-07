class C1{
    public int x = 3;
    protected int y = 45;
    int z = 5; 
    private int a = 89;
    // public void meth1(){
    //     System.out.println(x);
    //     System.out.println(y);
    //     System.out.println(z);
    //     System.out.println(a);
    // }
}

class C2 extends C1{
    void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        // System.out.println(a);
    }
}

public class A48_Access_Modifiers {
    public static void main(String[] args){
        // C1 c = new C1();
        // c.meth1();
        C2 c = new C2();
        c.meth2();
        // System.out.println(c.x);
        // System.out.println(c.y);
        // System.out.println(c.z);
        // System.out.println(c.a); --> throw error because a is private 
    }
}