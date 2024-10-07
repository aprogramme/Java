import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}
interface MyInt{
    void display();
}
public class A79_PracticeSet {
    public static void main(String[] args) {
        // MyDeprecated d = new MyDeprecated();
        // d.meth1();
        // MyInt i = () -> System.out.println("I am display");

        int i = 5;
        String table = " ";
        for(int j = 1; j<=10; j++){
            table += i + "X"+j + "=" + i*j;
            table += "\n";
        }
        try{
            FileWriter myFileWriter = new FileWriter("MultiplicationTable.txt");
            myFileWriter.write(table);
            myFileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}