class MyNewThr1 extends Thread{
    public MyNewThr1(String name){
        super(name);
    }
    public void run(){
        int i = 0;
    
        while(true){
            System.out.println("Hello World 1");
            try{
                Thread.sleep(455);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread{
    public void run(){
        // int i = 0;
    
        while(true){
            System.out.println("Hello World 2");
        }
    }
}

public class A53_Thread_Method {
    public static void main(String[] args){
        MyNewThr1 t1 = new MyNewThr1("Aayush1");
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        // try{
        //     t1.join();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        
        t2.start();

    }
}