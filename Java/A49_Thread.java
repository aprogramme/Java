// Creating thread using extend class
class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<20000){
        System.out.println("My cooking thread is running");
        System.out.println("I am happy");
        i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<20000){
        System.out.println("My chatting thread is running");
        System.out.println("I am sad");
        i++;
        }
    }
}

public class A49_Thread {
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
