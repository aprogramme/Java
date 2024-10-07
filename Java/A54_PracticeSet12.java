class Practice12a extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Good Morning!");
        }
    }
}
class Practice12b extends Thread{
    public void run(){
        // while(true){
        //     try{
        //         Thread.sleep(200);
        //     }
        //     catch(Exception e){
        //         System.out.println(e);
        //     }
        //     System.out.println("Welcome!");
        // }
    }
}

public class A54_PracticeSet12 {
    public static void main(String[] args){
        Practice12a p1 = new Practice12a();
        Practice12b p2 = new Practice12b();
        // p1.setPriority(6);
        // p1.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        // p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}