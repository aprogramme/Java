interface Dem0Ano{
        void meth1();
        void meth2();
    }
// class anonyDemo implements Dem0Ano{
//     public void display(){
//         System.out.println("Hello");
//     }
//     @Override
//     public void meth1(){
//         System.out.println("I am meth 1");
//     }
//     @Override
//     public void meth2(){
//         System.out.println("I am meth 2");
//     }
// }

public class A76_Lambda {
    public static void main(String[] args) {
        // anonyDemo obj = new anonyDemo();
        // obj.meth1();
        Dem0Ano obj = new Dem0Ano(){
            @Override
            public void meth1(){
                System.out.println("I am meth 1");
            }
            public void meth2(){
                System.out.println("I am meth 2");
            }
        };
        obj.meth1();

    }
}
