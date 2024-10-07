public class A19_Arrays {
    public static void main(String[] args) {
        /* 
        Classroom of 500 students - You have to store marks of these 500 students 
        We have 2 choices:
        1. Use 500 variables
        2. Use Arrays
        */
        // THERE ARE 3 WAYS TO CREATE AN ARRAY IN JAVA:
        // 1. Declaration + Allocation
        // int [] marks = new int[5];  

        // 2. Declaration then Allocation
        // int [] marks; 
        // marks = new int[5];   
        // marks[0] = 100;
        // marks[1] = 98;
        // marks[2] = 69;
        // marks[3] = 78;
        // marks[4] = 86; 
        // marks[5] = 56;  // throws an error

        // 3. Declaration + Allocation + Initialize
        // int [] marks = {89, 78, 69, 99, 65};
        // System.out.println(marks[3]);


        // ARRAY'S METHODS:
        /* 
        // int [] marks = {89, 78, 69, 99, 65};
        float [] marks = {89.04f, 78.54f, 69.8f, 99.1f, 6.5f};
        System.out.println(marks[2]);
        System.out.println(marks.length);
        String [] students = {"aayush", "harry", "shubham", "rohan"};
        System.out.println(students[2]);
        System.out.println(students.length);
        */

        int [] marks = {89, 78, 69, 99, 65};
        // System.out.println(marks.length);
        // Displaying the Array (Naive way)
        System.out.println("Printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        
        // Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for(int i = 0; i< marks.length; i++){
            System.out.println(marks[i]);
        }

        // Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for(int element: marks){
            System.out.println(element);
        }
    }
    
}