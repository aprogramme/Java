// Creating thread using runnable interface

class ThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<1000){
            System.out.println("I am a thread 1 ");
            i++;
        }
    }
}
class ThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<1000){
            System.out.println("I am a thread 2");
            i++;
        }
        
    }
}
public class A50_Thread {
    public static void main(String[] args){
        ThreadRunnable1 bullet1 = new ThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        ThreadRunnable2 bullet2 = new ThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
