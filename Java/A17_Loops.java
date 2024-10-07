public class A17_Loops {
    public static void main(String[] args) {
        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);

        // -----------------------WHILE LOOP-----------------------
        // while loop:
        // int i = 1;
        // while(i <= 4){
        //     System.out.println(i);
        //     i++;
        // }
        // while(true){
        //     System.out.println("Hello");
        // }

        // int i = 100;
        // while(i <= 200){
        //     System.out.println(i);
        //     i++;
        // }

        // -----------------------DO-WHILE LOOP-----------------------
        // do-while loop:
        // int b = 0;
        // do{
        //     System.out.println(b);
        //     b++;
        // }while(b<5);

        // int c = 0;
        // System.out.println("First 50 natural number");
        // do{
        //     System.out.println(c);
        //     c++;
        // }while(c<50);

        // -----------------------FOR LOOP----------------------- 
        // for loop:
        // for(int i = 0; i <= 10; i++){
        //     System.out.println(i);
        // }

        // 2n = Even number
        // 2n + 1 = Odd number 
        // int n = 10;
        // for(int i = 0; i < n; i++){
        //     System.out.println(2*i+1);
        // }

        // for(int i = 5; i > 0; i--){
        //     System.out.println(i);
        // }

        // -----------------------BREAK AND CONTINUE STATEMENT----------------------- 
        // -----------BREAK STATEMENT-----------
        // for(int i = 0; i < 6; i++){
        //     System.out.println(i);
        //     System.out.println("Java is great");
        //     if(i == 2){
        //         System.out.println("Ending the loop");
        //         break;
        //     }
        // }

        // int i = 0;
        // while(i < 6){
        //     System.out.println(i);
        //     System.out.println("Java is great");
        //     if(i == 2){
        //         System.out.println("Ending the loop");
        //         break;
        //     }
        //     i++;
        // }

        // int i = 0;
        // do{
        //     System.out.println(i);
        //     System.out.println("Java is great");
        //     if(i == 2){
        //         System.out.println("Ending the loop");
        //         break;
        //     }
        //     i++;
        // }while(i < 6);


        // -----------CONTINUE STATEMENT-----------
        // for(int i = 0; i < 6; i++){
        //     if(i == 3){
        //         System.out.println("Ending the loop");
        //         continue ;
        //     }
        //     System.out.println(i);
        //     System.out.println("Java is great");
        // }

        int i = 0;
        do{
            i++;
            if(i == 2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }while(i < 6);
    }
}