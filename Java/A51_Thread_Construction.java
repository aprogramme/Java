class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        // int i = 34;
        System.out.println("Hello World");
        // while(true){
        //     System.out.println("I am a thread");
        // }
    }
}

public class A51_Thread_Construction {
    public static void main(String[] args){
        MyThr t1 = new MyThr("Aayush");
        MyThr t2 = new MyThr("Harry");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t1 is " + t1.getId());
        System.out.println("The id of the thread t1 is " + t1.getName());
        System.out.println("The id of the thread t2 is " + t2.getId());
        System.out.println("The id of the thread t2 is " + t2.getName());
    }
}