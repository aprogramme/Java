class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        // int i = 0;
    
        while(true){
            System.out.println("Hello World " + this.getName());
        }
    }
}


public class A52_Thread_Priorities {
    public static void main(String[] args){
        // Ready Queue T1 T2 T3 T4
        MyThr1 t1 = new MyThr1("Aayush1");
        MyThr1 t2 = new MyThr1("Aayush2");
        MyThr1 t3 = new MyThr1("Aayush3");
        MyThr1 t4 = new MyThr1("Aayush4");
        MyThr1 t5 = new MyThr1("Aayush5 (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
