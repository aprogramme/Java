public class A23_Method_Overloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good Morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good Morning " + a + " bro!");
        System.out.println("Good Morning " + b + " bro!");
    }

    static void change(int a){
        a = 98;
    }

    static void change1(int [] arr){
        arr[0] = 98;
    }

    static void tellJoke(){
        System.out.println("I invented a new word!\n" + "Plagiarism");
    }

    public static void main(String[] args){
        // tellJoke();
        // Case 1: Changing the integer:  the value of x will not change
        // int x = 45;
        // change(x);
        // System.out.println("Value of x after running: " + x);
        
        // Case 2: Changing the Array:  the value of arr[0] will change
        // int [] marks = {34, 32, 65, 76, 87, 69};
        // change1(marks);
        // System.out.println("Value of arrr[0] after running: " + marks[0]);


        // METHOD OVERLOADING: 
        foo();
        foo(3000);
        foo(4000, 5000); // Arguments are actual  // a and b are parameters
    }
}
